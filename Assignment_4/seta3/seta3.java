import java.io.*;
import java.util.*;
class seta3
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Source file name:");
		String file1 = sc.next();
		System.out.println("Destination file name:");
		String file2 = sc.next();
		FileReader fin = new FileReader(file1);
		FileWriter fout = new FileWriter(file2,true);
		int c;
		while((c = fin.read()) != -1)
		{
			fout.write(c);
		}
		System.out.println("End of File...");
		fin.close();
		fout.close();
	}
}
