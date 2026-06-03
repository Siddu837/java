import java.util.Arrays; // for basic sorting 
import java.util.Collections; //for reverse sorting


public class inbuiltsort {
    
    public static void printarr(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
     System.out.println();   
    }
    public static void main(String args[]){
        Integer arr[] = {5, 4, 7, 1, 3}; // int is primitive type , work for basic sorting and Integer is object type works for all types of sorting
        Arrays.sort(arr, 0, 3); // time complexity is O(log n) is very less compared to other sortings like bubble, insert, select
        printarr(arr); // default ascending order
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printarr(arr);
    }
}
