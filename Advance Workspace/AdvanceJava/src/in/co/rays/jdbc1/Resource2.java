package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Resource2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	ResourceBundle res = ResourceBundle.getBundle("in.co.rays.bundel.app");
	Class.forName(res.getString("Driver"));
	
	String user = res.getString("user");
	String pass = res.getString("password");
	String url = res.getString("url");
	
	Connection con = DriverManager.getConnection(url,user,pass);
	
	Statement st = con.createStatement();
	
	int i = st.executeUpdate("insert into empdetails values(20 , 'Akshay Kumar' , 'India','kiladi@gmail.com')");
	
	System.out.println(i +"success");
}
}
