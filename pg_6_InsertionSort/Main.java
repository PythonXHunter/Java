import java.util.*;

class Main{
    static void sel_sort(int numArray[]){
        int n = numArray.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1; j<n;j++)
                if(numArray[j] < numArray[min])
                    min = j;
            int temp = numArray[min];
            numArray[min] = numArray[i];
            numArray[i] = temp;
        }
    }
    public static void main(String args[]){
        int numArray[] = {7,5,2,20,42,15,23,34,10};
        System.out.println("Original Array:" + Arrays.toString(numArray));
        sel_sort(numArray);
        System.out.println("Sorted Array:" + Arrays.toString(numArray));
    }
}