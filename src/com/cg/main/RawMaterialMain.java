package com.cg.main;

import java.util.HashMap;
import java.util.Scanner;

import com.cg.dao.RawMatrialDaoImpl;
import com.cg.exception.orderNotFoundException;
import com.cg.service.RawMaterialService;
import com.cg.service.RawMaterialServiceImpl;

public class RawMaterialMain {
	public RawMaterialMain(){
	RawMaterialService dservice = new RawMaterialServiceImpl();
	Scanner sc = new Scanner(System.in);
	int choice =0;
	while(true) {
		getChoice();
		choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			placeAnOrder(dservice,sc);
			break;
		case 2:
			
			updateAnOrder(dservice,sc);
			break;				
		case 3:
			sc.nextLine();
			displayOrderDetails(dservice,sc);
			break;
		case 4:
			System.out.println("Thank You..See You Again!!");
			System.exit(0);
			break;
		

		default:
			System.out.println("Please enter a valid input");
			break;
		}
		
	}
}

private void displayOrderDetails(RawMaterialService dservice, Scanner sc) {
	
	try {
		System.out.println("Enter the order ID");
		String id = sc.nextLine();
		RawMaterialStock prod= dservice.trackProductOrder(id);
		System.out.println(prod);
	} catch (orderNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	//	e.printStackTrace();
	}
	
	
}

private void updateAnOrder(RawMaterialService dservice, Scanner sc) {
	HashMap<String,RawMaterialStock> daoMap = dservice.getMap();
	sc.nextLine();
	//System.out.println(daoMap);
	System.out.println("Enter the orderID you want to update");
	String orderId = sc.nextLine();
	RawMaterialStock prod = daoMap.get(orderId);
	System.out.println(prod);
	System.out.println("1. Update price");
	System.out.println("2. Update Quantity");
	System.out.println("3. Update Date of Delivery");
	
	int choice = sc.nextInt();
	
	

	switch (choice) {
	case 1:
		System.out.println("Enter price");
		double price = sc.nextDouble();
		//sc.nextLine();
		prod.setPrice(price);
		System.out.println("Price updated successfully");
		break;
	case 2:
		System.out.println("Enter Quantity Unit");
		double qty = sc.nextDouble();
		//sc.nextLine();
		prod.setQuantityUnit(qty);
		System.out.println("Quantity Unit updated succesfully");
		break;
	case 3:
		System.out.println("Enter Delivery Date");
		sc.nextLine();
		String dDate = sc.nextLine();
		prod.setDeliveryDate(dDate);
		System.out.println("Delivery Date updated successfully");
		break;
	default:
		System.out.println("Please Enter numbers between 1 to 3");
		break;
	}

	daoMap.put(orderId, prod);
	dservice.setMap(daoMap);
	
}

private void placeAnOrder(RawMaterialService dservice, Scanner sc) {
	sc.nextLine();
	System.out.println("Enter order ID : ");
	String oid=sc.nextLine();
   // sc.nextLine();
	System.out.println("Enter name : ");
	String name=sc.nextLine();
	System.out.println("Enter Price per Unit : ");
	double ppu=sc.nextDouble();
	System.out.println("Enter Quantity Value : ");
	double qValue=sc.nextDouble();
	System.out.println("Enter Quantity Unit : ");
	double qUnit=sc.nextDouble();
	System.out.println("Enter Price : ");
	double price=sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter Ware House ID : ");
	String wHouse=sc.nextLine();
	System.out.println("Enter Delivery Date : ");
	String dDate=sc.nextLine();
	System.out.println("Enter Manufacturing Date : ");
	String mDate=sc.nextLine();
	System.out.println("Enter Expiry Date : ");
	String eDate=sc.nextLine();
	System.out.println("Enter Status : ");
	String status=sc.nextLine();
	RawMaterialStock product = new RawMaterialStock(oid,name, ppu, qValue,qUnit, price, wHouse, dDate, mDate,eDate,status);
	if(dservice.updateProductStock(product)) {
		System.out.println(product);
		System.out.println("Order placed sucessfully");
	}
	
	
}

private void getChoice() 
{
	
	System.out.println("1. Place an Order");
	System.out.println("2. Update an Order");
	System.out.println("3. Display Order Details");
	//System.out.println("4. Display Supplier Details");
	//System.out.println("5. Display Distributor Details");
	System.out.println("4. Exit System");
	System.out.println("Enter your choice");
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new RawMaterialMain();
	}

}
