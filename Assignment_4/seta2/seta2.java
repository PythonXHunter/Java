import java.io.*;
import java.util.*;

class seta2{
	public static void main(String args[]) throws IOException{
		FileReader f = new FileReader("sample.txt");
		Scanner sc = new Scanner(f);
		String ch,ch2;
		while(sc.hasNext()){
			StringBuilder ch1 = new StringBuilder();
			ch = sc.next();
			System.out.println(ch);
			ch2 = ch.toUpperCase();
			System.out.println(ch2);
			ch1.append(ch2);
			System.out.println(ch1);
			ch1.reverse();
			System.out.println(ch1);
			//System.out.println(ch2);
		}
		f.close();
	}
}
