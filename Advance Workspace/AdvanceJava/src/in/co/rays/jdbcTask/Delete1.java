package in.co.rays.jdbcTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete1 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	int count = delete();
	if(count==0) {
		System.out.println("Deletion not successfull");
	}else {
		System.out.println("Record delete successfully");
	}
}

private static int delete() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	Statement st = conn.createStatement();
	int i = st.executeUpdate("delete from empdetails where id =1");
	st.close();
	conn.close();
	return i;
	
}
}
