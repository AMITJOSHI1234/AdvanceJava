package in.co.rays.jdbcTask;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class callableFunction1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	
	CallableStatement cal = con.prepareCall("{? = CALL getNameCount()}");
	
	cal.registerOutParameter(1, Types.INTEGER);
	
	cal.execute();
	
	System.out.println(cal.getInt(1));
	
	con.close();
	cal.close();
}
}
