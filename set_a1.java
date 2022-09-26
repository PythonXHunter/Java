import java.io.*;

class employee
{
	int id,salary;
	String name,deptname;
	static int count = 1;
	
	employee(){
		id = 0;
		salary =0;
		name = null;
		deptname = null;
	}
	
	employee(int id ,String name,String deptname,int salary)
	{
		this.id = id;
		this.name = name;
		this.deptname = deptname;
		this.salary = salary;
	}
	
	void display(){
		System.out.println(id + "\t" + name + "\t" + deptname + "\t" + salary);
		System.out.println();
	}
	
	static void counter(){
	System.out.println("Object is Created:"+count);
	count++;
	}
}
	class set_a1{
	
	public static void main (String args[]) throws Exception
	{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the Number of Employees:");
		int n = Integer.parseInt(br.readLine());
		employee p[] = new employee[n];
		for(int i = 0; i<n;i++){
			System.out.println("Enter the Employee ID:");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter the Employee Name:");
			String name = br.readLine();
			
			System.out.println("Enter the Employee Deptname:");
			String deptname = br.readLine();
			
			System.out.println("Enter the Employee Salary:");
			int salary = Integer.parseInt(br.readLine());
		
			p[i] = new employee(id,name,deptname,salary);
			p[i].counter();
		}
			System.out.println("##########################");
			for(int i = 0 ;i<n;i++)
			
				p[i].display();
				

			System.out.println("##########################");
			
			
	

	}}
