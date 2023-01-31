package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Resource1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundel.app");
	Class.forName(rs.getString("Driver"));
	
	String user = rs.getString("user");
	String pass = rs.getString("password");
	String url = rs.getString("url");
	
	Connection con = DriverManager.getConnection(url,user,pass);
	
	Statement st = con.createStatement();
	
	int i = st.executeUpdate("insert into empdetails values(19 , 'Salman khan' , 'India','sal@gmail.com')");
	
	System.out.println(i +"success");
}
}
