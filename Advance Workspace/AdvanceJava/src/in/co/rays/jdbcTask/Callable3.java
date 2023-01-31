package in.co.rays.jdbcTask;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callable3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//calling procedure with no parameters
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	
	CallableStatement cal = con.prepareCall("{CALL getDetails1()}");
	cal.execute();
	ResultSet rs = cal.getResultSet();
	
	
	while(rs.next()) {
		System.out.print(rs.getInt("id")+"\t");
		System.out.print(rs.getString("name")+"\t");
		System.out.print(rs.getString("country")+"\t");
		System.out.println(rs.getString("email"));
	}
	con.close();
	cal.close();
}
}
