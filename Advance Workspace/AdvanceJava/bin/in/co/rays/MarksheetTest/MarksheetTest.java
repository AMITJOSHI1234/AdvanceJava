package in.co.rays.MarksheetTest;

import in.co.rays.MarksheetBean.MarksheetBean;
import in.co.rays.MarksheetModel.MarksheetModel;

public class MarksheetTest {
public static void main(String[] args) {
	testAdd();
}

public static void testAdd() {
	MarksheetBean bean = new MarksheetBean();
	MarksheetModel md = new MarksheetModel();
	bean.setId(5);
	bean.setRollno(1005);
	bean.setFname("Mohit");
	bean.setLname("Rajput");
	bean.setMaths(62);
	bean.setPhysics(65);
	bean.setChemistry(60);
	
	try {
		MarksheetBean b = new MarksheetBean();
	  b = md.add(bean);
		if(b!=null) {
			System.out.println("success");
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
