package in.co.rays.jdbcTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select1 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from empdetails");
	System.out.println("id" + " : " + "name" + " : " + "country" + " : " + "email");
	while(rs.next()) {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String country = rs.getString("country");
		String email = rs.getString("email");
		
		System.out.println(id +" : " + name + " : "+ country +" : " + email);
	}
	st.close();
	con.close();
	
}
}
