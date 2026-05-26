

public class pairsofarray {

    public static void arraypairs(int arr[]){

 

        for(int i = 0; i < arr.length; i++){

            int curr = arr[i];

            for(int j = i+1; j < arr.length;j++){

                System.out.print("the pair of "+ curr+" is ("+curr+", "+ arr[j]+") ");
                

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr [] = {2, 4, 5, 8, 9};
        arraypairs(arr);
    }
    
}
