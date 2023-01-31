package in.co.rays.jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Procedure3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	CallableStatement cal = con.prepareCall("{CALL getDetails1()}");
	cal.execute();
	
	ResultSet res = cal.getResultSet();
	System.out.println("id" + " " + "name"+" "+"country"+" "+"email");
	while(res.next()) {
		int id = res.getInt("id");
		String name = res.getString("name");
		String country = res.getString("country");
		String email = res.getString("email");
		
		System.out.println(id + " " + name + " " +country + " " + email);
	}
	
}
}
