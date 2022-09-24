import java.util.Scanner;

class AcceptArrayInput{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Size Of Array:");
       
       int num = sc.nextInt();
       int number[] = new int[5];
       for(int i = 0;i<num;i++){
           System.out.println("Enter The Number: ");
           
           number[i] = sc.nextInt();
           
       }
       System.out.println("The Elements are:");
       for(int i = 0;i<num;i++){
           System.out.println(number[i]);
       }
       
    }
}