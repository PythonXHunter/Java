interface PrintNumber{
	public void print(int num1);
}

public class Sample_5{
	public static void main(String[] a){
		PrintNumber p = n ->System.out.println("Square is:" + n*n);
		p.print(5);
	}
}
