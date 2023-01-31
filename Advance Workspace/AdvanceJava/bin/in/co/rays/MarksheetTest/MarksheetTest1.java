package in.co.rays.MarksheetTest;

import java.util.Scanner;

import in.co.rays.MarksheetBean.MarksheetBean1;
import in.co.rays.MarksheetModel.MarksheetModel1;

public class MarksheetTest1 {
public static void main(String[] args) {
	//testAdd();
	//testUpdate();
	Scanner s = new Scanner(System.in);
	System.out.println("Choose Operations");
	System.out.println("1.Insert");
	System.out.println("2.Update");
	System.out.println("3.Delete");
	System.out.println("4.getRoll");
	System.out.println("5.getMeritList");
	
	System.out.println("Enter option");
	int num = s.nextInt();
	
	switch(num) {
	case 1:{
		testAdd();
		break;
	}
	case 2:{
		testUpdate();
		break;
	}
	case 3:{
		testDelete();
		break;
	}
	
	case 4:{
		getRoll();
		break;
	}
	
	case 5:{
		getMeritlist();
		break;
	}
	default:{
		System.out.println("You choose wrong option");
	}
	}
}

public static void testAdd() {
	MarksheetBean1 bean = new MarksheetBean1();
	MarksheetModel1 md = new MarksheetModel1();
	
	bean.setId(6);
	bean.setRollno(1006);
	bean.setFname("Rajkumar");
	bean.setLname("Rao");
	bean.setChemistry(75);
	bean.setMaths(55);
	bean.setPhysics(60);
	
	try {
		
	 md.add(bean);
		
		System.out.println("data inserted succesfully");
			
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}

public static void testUpdate() {
	MarksheetBean1 bean = new MarksheetBean1();
	MarksheetModel1 md = new MarksheetModel1();
	
	bean.setId(3);
	bean.setFname("Aakash");
	bean.setLname("Vad");
	
	try {
		MarksheetBean1 b = new MarksheetBean1();
		b = md.update(bean);
		if(b!=null) {
			System.out.println("Success");
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}


public static void testDelete() {
MarksheetBean1 bean = new MarksheetBean1();
MarksheetModel1 md = new MarksheetModel1();

bean.setId(6);

try {
	MarksheetBean1 b = new MarksheetBean1();
	b = md.delete(bean);
	if(b!=null) {
		System.out.println("Success");
	}
} catch (Exception e) {
	System.out.println(e.getMessage());
}
}

public static void getRoll() {

	MarksheetBean1 bean = new MarksheetBean1();
	MarksheetModel1 md = new MarksheetModel1();
	
	bean.setRollno(1004);
	
	try {
	  MarksheetBean1 b = new MarksheetBean1();
		//ArrayList b1 = new ArrayList();
		b = md.getRoll(bean);
	
		if(b!=null) {
			System.out.println("Success");
		}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

public static void getMeritlist() {
	MarksheetBean1 bean = new MarksheetBean1();
	MarksheetModel1 mb = new MarksheetModel1();
	try {
	MarksheetBean1 b = new MarksheetBean1();
	b = mb.meritlist(bean);
	if(b!=null) {
		System.out.println("success");
	}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}

