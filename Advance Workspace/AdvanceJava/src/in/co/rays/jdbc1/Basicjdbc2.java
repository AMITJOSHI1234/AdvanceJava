package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Basicjdbc2 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	add();
}

public static void add() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root@123");
	Statement st = con.createStatement();
	int i = st.executeUpdate("insert into country values('Australia' , 'Melbourn')");
	System.out.println( i + " " + "Data inserted");
	st.close();
	con.close();
	
	
}
}
