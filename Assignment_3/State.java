import java.io.*;

class Continent{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String con;
	
	void cont() throws IOException {
	System.out.println("Enter the Continent:");
	con = br.readLine();
	}
}

class Country extends Continent{
	String cou;
	void coun() throws IOException {
	System.out.println("Enter The Country:");
	cou = br.readLine();
	}
}

class State extends Country{
	String state,place;
	void Stat() throws IOException {
	System.out.println("Enter The State:");
	state = br.readLine();
	System.out.println("Enter The Place:");
	place = br.readLine();
	}
	
	public static void main(String args[]) throws IOException {
		State o1 = new State();
		o1.cont();
		o1.coun();
		o1.Stat();
		
		System.out.println("Continent:"+o1.con);
		System.out.println("Country:"+o1.cou);
		System.out.println("State:"+o1.state);
		System.out.println("Place:"+o1.place);
	}
}
