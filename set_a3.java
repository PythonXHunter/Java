import java.io.*;

class set_a3{
	public static void main(String args[]){
		int a = args.length;
		int array[] = new int[5];
		if(a <= 5){
			System.out.println("You Have Entered more than 5 Elements:");
		}
		else{
			System.out.println("Unsorted Array:");
			for(int i = 0 ; i<a;i++){
				array[i] = Integer.parseInt(args[i]);
				System.out.println(args[i]);
			}
			System.out.println("---------------");
			for(int i =0;i<a;i++){
				for(int j = i + 1;j<a;j++){
					if(array[i]> array[j]){
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			System.out.println("Sorted Elements:");
			for(int i =0;i<a;i++){
				System.out.println(array[i]+"\t");
			}
		}
	}
}
