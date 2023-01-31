package in.co.rays.MarksheetModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import in.co.rays.MarksheetBean.MarksheetBean;

public class MarksheetModel {
public MarksheetBean add(MarksheetBean bean) throws ClassNotFoundException, SQLException {
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundel.app");
	Class.forName(rs.getString("Driver"));
	String user = rs.getString("user");
	String psw = rs.getString("password");
	String url = rs.getString("url");
	
	Connection con = DriverManager.getConnection(url , user , psw);
	PreparedStatement ps = con.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?,?)");
	
	ps.setInt(1, bean.getId());
	ps.setInt(2, bean.getRollno());
	ps.setString(3, bean.getFname());
	ps.setString(4, bean.getLname());
	ps.setInt(5, bean.getChemistry());
	ps.setInt(6, bean.getMaths());
	ps.setInt(7, bean.getPhysics());
	ps.setInt(8, bean.getTotal());
	
	int i =ps.executeUpdate();
	
	return bean;
	
	
}
}
