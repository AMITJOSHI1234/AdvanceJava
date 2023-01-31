package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class transaction1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	try {
		con.setAutoCommit(false);
		String s1 = "insert into empdetails (id , name , country , email) values(11 , 'Mahesh Babu' , 'India' , 'mah@gmail.com')";
		String s2 = "insert into empdetails (id , name , country , email) values(12 , 'chris evans' , 'USA' , 'chris@gmail.com')";
		Statement st  = con.createStatement();
		
		int i = st.executeUpdate(s1);
		i = st.executeUpdate(s2);
		System.out.println(i + " "+"Data insert successfully");
		con.commit();
	}catch(Exception e) {
		con.rollback();
		System.out.println("Database failure");
		System.out.println(e.getMessage());
	}
}
}
