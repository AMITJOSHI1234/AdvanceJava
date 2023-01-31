package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlTask1 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	//alter();
	update();
}

private static void update() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root@123");
	Statement st = con.createStatement();
	int i = st.executeUpdate("update stustatus set email = 'fail@gmail.com' where result ='Fail'");
	System.out.println( i + "Table updated");
	st.close();
	con.close();
	
}

private static void alter() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root@123");
	Statement stmt = con.createStatement();
	int i = stmt.executeUpdate("alter table stustatus add  email varchar(255)");
	System.out.println( i + "Table altered");
	stmt.close();
	con.close();
}
}
