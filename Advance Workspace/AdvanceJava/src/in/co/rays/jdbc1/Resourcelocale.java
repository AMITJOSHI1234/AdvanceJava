package in.co.rays.jdbc1;

import java.util.Locale;
import java.util.ResourceBundle;

public class Resourcelocale {
public static void main(String[] args) {
	Locale l = new Locale("Hi","In");
	Locale l1 = new Locale("es","Us");
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundel.app_local",l);
	ResourceBundle rs1 = ResourceBundle.getBundle("in.co.rays.bundel.app_local",l1);
	System.out.println("Question: "+rs.getString("greeting"));
	System.out.println("Ans: "+rs1.getString("ans"));
}
}