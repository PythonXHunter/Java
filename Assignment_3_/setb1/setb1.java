import java.util.*;

abstract class order
{
	int id;
	String Description;
	abstract void accept();
	abstract void display();
	Scanner scan = new Scanner(System.in);
}

class PurchaseOrder extends order{
	String customerName;
	String vendorName;
	void accept(){
		System.out.println("Enter The id :");
		id = scan.nextInt();
		System.out.println("Enter The Description :");
		Description = scan.nextLine();
		System.out.println("Enter The Customer Name :");
		customerName = scan.nextLine();
		System.out.println("Enter The Vendor Name :");
		vendorName = scan.nextLine();
		
	}
	
	void display()
	{
		System.out.println("Id "+id);
		System.out.println("Description "+Description);
		System.out.println("Customer Name "+customerName);
		System.out.println("Vendor Name "+vendorName);
	}
}

class SalesOrder extends order{
	String customerName;
	String vendorName;
	void accept(){
		System.out.println("Enter The id :");
		id = scan.nextInt();
		System.out.println("Enter The Description :");
		Description = scan.nextLine();
		System.out.println("Enter The Customer Name :");
		customerName = scan.nextLine();
		System.out.println("Enter The Vendor Name :");
		vendorName = scan.nextLine();
		
	}
	void display()
	{
		System.out.println("Id "+id);
		System.out.println("Description "+Description);
		System.out.println("Customer Name "+customerName);
		System.out.println("Vendor Name "+vendorName);
	}
}

public class setb1{
	public static void main(String args[]) {
	PurchaseOrder[] pO = new PurchaseOrder[3];
	SalesOrder[] sO = new SalesOrder[3];
	System.out.println("Enter the Details for Purchases");
	for(int i = 0; i<3;i++){
		pO[i] = new PurchaseOrder();
		pO[i].accept();
	}
	System.out.println("Enter the Details for Sales");
	for(int i = 0; i<3;i++){
		sO[i] = new SalesOrder();
		sO[i].accept();
	}
	System.out.println("Details for Purchases Made");
	for(int i = 0; i<3;i++){
		pO[i].display();
	}
	for(int i = 0; i<3;i++){
		sO[i].display();
	}
	}
}



































