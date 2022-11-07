import java.io.*;
import java.util.*;

class patient extends Exception
{
	int a, b;
	patient(int a, int b){
		this.a = a ;
		this.b = b;
	}
}

public class seta1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Patient Name:");
		String name =  br.readLine();
		System.out.println("Enter The Patient Age:");
		int age =  Integer.parseInt(br.readLine());
		System.out.println("Enter The Patient Oxygen Level:");
		int oxy =  Integer.parseInt(br.readLine());
		System.out.println("Enter The Patient HRCT Report:");
		int hrct =  Integer.parseInt(br.readLine());
		if(oxy <= 95 && hrct >= 10)
		{
			try {
				throw new NullPointerException("\n");
			}
			catch(Exception e){
				System.out.println("Patient is COvid Positive(+) and Need to Hospitalized");
			}
		}
		else{
			System.out.println("Pateints Name is ="+name);
			System.out.println("Pateints Age is ="+age);
			System.out.println("Pateints Oxygen Level is ="+oxy);
			System.out.println("Pateints HRCT is ="+hrct);
		}
		
		
	}
}
