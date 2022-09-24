class Main{
    public static void main(String args[]){
        int number[] = {74,65,1,25,63};
        int n = number.length; 
        System.out.println("Given List:");
        // Display Of the Array
            for(int i = 0;i<n;i++){
                System.out.println(number[i]);
            }
        
        // Sorted Array
        for(int i = 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(number[i] < number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        
        // Display of Sorted Array
        System.out.println("Sorted Array:");
            for(int i = 0;i<n;i++){
                System.out.println(" "+number[i]);
            }
        System.out.println(" ");
        
        
    }
}