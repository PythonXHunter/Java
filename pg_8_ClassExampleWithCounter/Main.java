import java.util.*;
class employee{
    
    int id,salary;
    String name,deptname;
    static int count = 1;
    
    employee(){
        id = 0;
        name = null;
        deptname = null;
        salary = 0;
    }
    
    employee(int id,int salary,String name,String deptname){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.deptname = deptname;
    }
    
    static void counter(){
        System.out.println("Object is Created:" + count);
        count++;
    }
    
    void display(){
        System.out.println("["+id+",\t"+salary+",\t"+name+",\t"+deptname+"]");
        System.out.println();
    }
}  

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The no. of Employees:");
        int n = sc.nextInt();
        employee p[] = new employee[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the Id:");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Enter the Name:");
            String name = sc.nextLine();
            
            
            System.out.println("Enter the Salary:");
            int salary = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Enter the Deptname:");
            String deptname = sc.nextLine();
            
            p[i] = new employee(id,salary,name,deptname);
            p[i].counter();
        }
        System.out.println("######################");
        for(int i =0 ;i<n;i++)
            p[i].display();
            System.out.println("######################");
        
        
    }
}