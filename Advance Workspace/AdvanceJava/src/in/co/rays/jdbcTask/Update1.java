package in.co.rays.jdbcTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update1 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	int count = update();
	if(count==0) {
		System.out.println("Table not updated successfully");
	}else {
		System.out.println("Table updated successfully");
	}
}

private static int update() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	Statement st = con.createStatement();
	int i = st.executeUpdate("update empdetails set email = 'robert@gmail.com' where id = 5");
	st.close();
	con.close();
	return i;
	
}
}