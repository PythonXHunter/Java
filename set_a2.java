import java.io.*;

class Student{
	int roll_no;
	String name;
	double percentage;
	static int count ;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	/*Student(int roll_no,String name,double percentage){
		this.roll_no = roll_no;
		this.name = name;
		this.percentage = percentage;
	}*/
	
	void get() throws Exception
	{
		System.out.println("\n Enter The roll_no , name , percentage:");
		roll_no = Integer.parseInt(br.readLine());
		name = br.readLine();
		percentage = Integer.parseInt(br.readLine());	
	}
	
	void display(){
		System.out.println("Roll no.:" + roll_no);
		System.out.println("Name:" + name);
		System.out.println("Percentage:" + percentage);
	}
	
	static void counter(){
		System.out.println(count + ":Object is Created");
	}
}
	
	


class set_a2{
	public static void main(String args[]) throws Exception{
		int i,j,n=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many Students:");
		n = Integer.parseInt(br.readLine());
		
		Student st[] = new Student[n];
		
		for(i = 0;i<n;i++){
			st[i] = new Student();
			st[i].get();
		}
		for(i =0;i<n;i++){
			st[i].display();	
		}
		
		
		sort_avg(st,n);
		
		System.out.println("***Sort By Average***");
		for(i =0 ;i<n;i++){
			st[i].display();
		}
		System.out.println("---------------------");
			
	}
	
	static void sort_avg(Student st[],int n){
		Student temp;
		for(int i =0 ;i<n;i++){
			for(int j =0;j<n;j++){
				if(st[i].percentage < st[j].percentage){
					temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
	}
	
	

}
