package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
	Statement st = con.createStatement();
	st.addBatch("insert into empdetails(id,name,country,email) values(17,'Tobey' ,'USA','tobey@12gmail.com')");
	st.addBatch("insert into empdetails(id,name,country,email) values(18,'Ajay Devgan' ,'India','ajay@12gmail.com')");
	st.addBatch("insert into empdetails(id,name,country,email) values(19,'KRK' ,'India','krk@12gmail.com')");
	st.addBatch("delete from empdetails where id = 19");
	
	int[] count = st.executeBatch();
	
	for(int i=0 ; i<count.length;i++) {
		System.out.println(count[i]);
	}
}
}
