class Continent{
	public void c1(){
		System.out.println("Asia");
	}
}

class Country extends Continent{
	public void c2(){
		System.out.println("India");
	}
	


/*class State extends Country{
	String n3 = "Maharashtra";
}*/


	public static void main(String args[]){
		Country o1 = new Country();
		o1.c1();
		o1.c2();
						
	}
}
