package in.co.rays.MarksheetModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import in.co.rays.MarksheetBean.MarksheetBean1;

public class MarksheetModel1 {
public  void add(MarksheetBean1 bean) throws ClassNotFoundException, SQLException {
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundel.app");
	Class.forName(rs.getString("Driver"));
	String user = rs.getString("user");
	String pass = rs.getString("password");
	String url = rs.getString("url");
	
	Connection conn = DriverManager.getConnection(url,user,pass);
	PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?,?)");
	
	ps.setInt(1, bean.getId());
	ps.setInt(2, bean.getRollno());
	ps.setString(3, bean.getFname());
	ps.setString(4, bean.getLname());
	ps.setInt(5, bean.getPhysics());
	ps.setInt(6, bean.getMaths());
	ps.setInt(7, bean.getChemistry());
	ps.setInt(8, bean.getTotal());
	
	int i = ps.executeUpdate();
	
	
}


public MarksheetBean1 update(MarksheetBean1 bean) throws ClassNotFoundException, SQLException {
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundel.app");
	Class.forName(rs.getString("Driver"));
	String user = rs.getString("user");
	String pass = rs.getString("password");
	String url = rs.getString("url");
	
	Connection con = DriverManager.getConnection(url,user,pass);
	PreparedStatement ps = con.prepareStatement("update marksheet set fname = ? , lname = ? where id = ?");
	ps.setString(1, bean.getFname());
	ps.setString(2, bean.getLname());
	ps.setInt(3, bean.getId());
	
	int i = ps.executeUpdate();
	
	return bean;
}

public MarksheetBean1 delete(MarksheetBean1 bean) throws ClassNotFoundException, SQLException {
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundel.app");
	Class.forName(rs.getString("Driver"));
	String user = rs.getString("user");
	String pass = rs.getString("password");
	String url = rs.getString("url");
	
	Connection conn = DriverManager.getConnection(url,user,pass);
	PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");
	ps.setInt(1, bean.getId());
	int i = ps.executeUpdate();
	
	return bean;
}

public MarksheetBean1 getRoll(MarksheetBean1 bean) throws ClassNotFoundException, SQLException {
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundel.app");
	Class.forName(rs.getString("Driver"));
	String user = rs.getString("user");
	String pass = rs.getString("password");
	String url = rs.getString("url");
	
	Connection conn = DriverManager.getConnection(url,user,pass);
	
	PreparedStatement ps = conn.prepareStatement("select * from marksheet where rollno = ?");
	ps.setInt(1, bean.getRollno());
	
	ResultSet rs1 = ps.executeQuery();
	
	while(rs1.next()) {
		int id = rs1.getInt("id");
		int rollno = rs1.getInt("rollno");
		String fname = rs1.getString("fname");
		String lname = rs1.getString("lname");
		int physics = rs1.getInt("physics");
		int chemistry = rs1.getInt("chemistry");
		int maths = rs1.getInt("Maths");
		int total = rs1.getInt("total");
		
		System.out.println(id +" "+rollno+" "+fname+" "+lname+" "+physics+" "+chemistry+" "+maths+" "+total);
	}    
	return bean;
}

public MarksheetBean1 meritlist(MarksheetBean1 bean) throws ClassNotFoundException, SQLException {
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundel.app");
	Class.forName(rs.getString("Driver"));
	String user = rs.getString("user");
	String pass = rs.getString("password");
	String url = rs.getString("url");
	
	Connection conn = DriverManager.getConnection(url,user,pass);
	PreparedStatement ps = conn.prepareStatement("select * from marksheet where total>=200 order by total desc");
	ResultSet rs1 = ps.executeQuery();
	
	ArrayList arr = new ArrayList<>();
	
	while(rs1.next()) {
		int id = rs1.getInt("id");
		arr.add(id);
		int rollno = rs1.getInt("rollno");
		arr.add(rollno);
		String fname = rs1.getString("fname");
		arr.add(fname);
		String lname = rs1.getString("lname");
		arr.add(lname);
		int physics = rs1.getInt("physics");
		arr.add(physics);
		int chemistry = rs1.getInt("chemistry");
		arr.add(chemistry);
		int maths = rs1.getInt("Maths");
		arr.add(maths);
		int total = rs1.getInt("total");
		arr.add(total);
	}
	
	Iterator it = arr.iterator();
	
	while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.print(object + " ");
	}
	System.out.println();
	
	return bean;
	
}
}
