public class selectionsort {

    public static void selection_sort(int arr[]){

        for( int i = 0; i < arr.length - 1; i++){
            int minpos = i;

            for(int j = i + 1; j < arr.length; j++){

                if(arr[minpos] > arr[j]){ // increasing > and decreasing < 
                    minpos = j;
                }
            }

            // swap

            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
     System.out.println();   
    }
    public static void main(String args[]){

        int arr[] = {4, 5, 6, 7, 8};

        selection_sort(arr);// time complexity is O(n²)
        printarr(arr);

    }
    
}
