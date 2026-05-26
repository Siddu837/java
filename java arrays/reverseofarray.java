
public class reverseofarray {

    public static void reversalarray(int arr[]){

        int start = 0, end = arr.length-1;

        while( start < end){
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        

    }
    public static void main(String args[]){

        int arr [] = {2, 5, 6, 9, 2};

        reversalarray(arr);



    }
    
}
