package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class Metadata1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	PreparedStatement st = con.prepareStatement("select * from empdetails");
	ResultSet rs = st.executeQuery();
	ResultSetMetaData meta = rs.getMetaData();
	
	System.out.println("DB name:"+meta.getCatalogName(1));
	System.out.println("Table:"+meta.getTableName(1));
	int coloumCount = meta.getColumnCount();
	System.out.println("Total coloum:"+coloumCount);
	
	//Display coloum count
	
	for(int i = 1;i<=coloumCount;i++) {
		System.out.println("Coloum:"+i);
		System.out.println("Label:"+meta.getColumnLabel(i));
		System.out.println("Name:"+meta.getColumnName(i));
		System.out.println("Type:"+meta.getColumnTypeName(i));
		System.out.println("Size:"+meta.getColumnDisplaySize(i));
		System.out.println("Precision:"+meta.getPrecision(i));
	}
	System.out.println();
	
	while(rs.next()) {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String country = rs.getString("country");
		String email = rs.getString("email");
		
		System.out.println(id +" "+name+" "+country+" "+email);
	}
	
}
}
