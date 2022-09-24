import java.util.*;
class Main{
    public static void main(String args[]){
        String country[] = new String[3]; 
        System.out.println("Enter The Number Of Countries:");
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        System.out.println("Enter the Countries:");
            for(int i = 0;i<country.length;i++){
                country[i] = sc.nextLine();
                }
            int size = country.length;
            String temp = null;
            for(int i = 0; i<size;i++){
                for(int j = i+1;j<size;j++){
                    if(country[j].compareTo(country[i]) > 0){
                        temp = country[i];
                        country[i] = country[j];
                        country[j] = temp;
                    }
                }
            }
            System.out.println("Sorted String");
                for(int i = 0 ;i<size;i++){
                    System.out.println(country[i]);
                }
    }
    
}