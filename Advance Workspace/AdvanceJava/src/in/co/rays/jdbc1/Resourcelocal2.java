package in.co.rays.jdbc1;

import java.util.Locale;
import java.util.ResourceBundle;

public class Resourcelocal2 {
public static void main(String[] args) {
	Locale l = new Locale("Hi","In");
	Locale l1 = new Locale("es","Us");
	
	ResourceBundle rs1 = ResourceBundle.getBundle("in.co.rays.bundel.app_local",l);
	ResourceBundle rs2 = ResourceBundle.getBundle("in.co.rays.bundel.app_local",l1);
	
	System.out.println("Request: "+rs1.getString("request") );
	System.out.println("Grant: "+rs2.getString("grant"));
}
}
