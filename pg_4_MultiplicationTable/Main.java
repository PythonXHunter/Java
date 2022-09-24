import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.println("Enter The Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1;i<=10;i++){
            int c = a*i;
            System.out.println(a + "\tx\t" + i +"\t=\t"+c);
        }
    }
}