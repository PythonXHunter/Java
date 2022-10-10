class Parent{
	public void p1(){
	System.out.println("Parent Process");
	}
}

public class Sample_1 extends Parent{
	public void c1(){
	System.out.println("Child Process");
	}
	
	public static void main(String args[]){
	Sample_1 o1 = new Sample_1();
	o1.c1();
	o1.p1();
	}
}
