package in.co.rays.jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class callable1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	CallableStatement cal= con.prepareCall("{CALL getName(?,?)}");
	cal.setInt(1, 8);
	cal.registerOutParameter(2, Types.VARCHAR);
	
	cal.execute();
	
	System.out.println(cal.getString(2));
}
}
