package in.co.rays.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root@123");
String sql = "insert into empdetails(id,name,country,email) values(?,? ,?,?)";
PreparedStatement pre = con.prepareStatement(sql);
pre.setInt(1, 15);
pre.setString(2,"Jr NTR");
pre.setString(3, "India");
pre.setString(4, "N@gmail.com");
pre.addBatch();

pre.setInt(1, 16);
pre.setString(2, "Andrew Garfield");
pre.setString(3, "USA");
pre.setString(4, "Andrew@gmail.com");
pre.addBatch();

int count[] =  pre.executeBatch();

for(int i=0 ; i<count.length;i++) {
	System.out.println(count[i]);
}

}
}
