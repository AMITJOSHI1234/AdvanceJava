package in.co.rays.jdbcTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Alter1 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	int count = alter();
	if(count==0) {
		System.out.println("Coloum added succesfully");
	}else {
		System.out.println("Coloum not added successfully");
	}
}

private static int alter() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	Statement st = con.createStatement();
	int i = st.executeUpdate("alter table empdetails add email varchar(255)");
	st.close();
	con.close();
	return i;
}
}
