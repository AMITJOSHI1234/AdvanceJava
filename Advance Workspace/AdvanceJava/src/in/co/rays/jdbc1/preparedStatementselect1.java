package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preparedStatementselect1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	PreparedStatement st = con.prepareStatement("select * from empdetails");
	ResultSet rs = st.executeQuery();
	
	System.out.println("id" + " : " + "name" + " : " + "country" + " : " + "email");
	
	while(rs.next()) {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String country = rs.getString("country");
		String email = rs.getString("email");
		
		System.out.println(id +" : " + name + " : "+ country +" : " + email);
	}
}
}
