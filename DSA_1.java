import java.util.*;
public class DSA_1 {
    public static void reverseArray(int[] arr, int start, int end){
        while(start <  end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--; 
        }
        
    }
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50,60};
        int m = 2;
        int n = arr.length;
        reverseArray(arr, m +1, n -1);
        System.out.println(Arrays.toString(arr));
    }
}
