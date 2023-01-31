package in.co.rays.jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Procedure2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	
	CallableStatement cal = con.prepareCall("{CALL getEmail(?)}");
	
	cal.registerOutParameter(1, Types.VARCHAR);
	
	cal.execute();
	
	System.out.println(cal.getString(1));
}
}
