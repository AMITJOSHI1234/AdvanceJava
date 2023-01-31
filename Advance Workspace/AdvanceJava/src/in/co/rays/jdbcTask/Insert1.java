package in.co.rays.jdbcTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert1 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	insert();
}

private static void insert() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	Statement st = con.createStatement();
	int i = st.executeUpdate("insert into empdetails(id,name,country) values(6 , 'Chris Hemsworth','Australia')");
	
	if(i==1) {
		System.out.println("Data inserted succesfully");
	}else {
		System.out.println("Data not inserted");
	}
	st.close();
	con.close();
}
}
