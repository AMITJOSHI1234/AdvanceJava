package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class bascijdbc {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root@123");
	Statement stmt = con.createStatement();
	int i = stmt.executeUpdate("insert into country values('Indonesia','Bali')");
	System.out.println(i +" " +"Data inserted");
	stmt.close();
	con.close();
}
}
