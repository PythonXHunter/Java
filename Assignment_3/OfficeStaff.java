import java.io.*;

abstract class Staff{
	int  id;
	String name;
	Staff(int id,String name){
	this.id = id;
	this.name = name;
	}
}

class OfficeStaff extends Staff{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String dept;
	OfficeStaff(int id,String name,String dept){
	super(id,name);
	this.dept = dept;
	}
	
	/*void get(){
	System.out.println("Enter the Id,Name and Dept");
	id = Integer.parseInt(br.readLine());
	name = br.readLine();
	dept = br.readLine();
	}*/
	
	void display(){
		System.out.println("Id:" + super.id);
		System.out.println("Name:" + super.name);
		System.out.println("Dept:" + dept);
	}
	
	public static void main(String args[]) throws IOException {
		int i,r,n;
		String na,da;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//o1.display();
		System.out.println("Enter the Number");
		n = Integer.parseInt(br.readLine());
		OfficeStaff o1[] = new OfficeStaff[n];
		for(i =0 ;i<n;i++){
			System.out.println("Enter the iD");
			r = Integer.parseInt(br.readLine());
			System.out.println("Enter the Name");
			na = br.readLine();
			System.out.println("Enter the Dept");
			da = br.readLine();
			o1[i] = new OfficeStaff(r,na,da);
			
		}
		for(i =0 ;i<n;i++){
			o1[i].display();
		}
		/*OfficeStaff[] o1 = new OfficeStaff[10];
		for(int i = 0;i<10;i++){
			o1[i] = new OfficeStaff();
			o1[i].get();
			o1[i].display();
		}
		*/
	}
	
}


