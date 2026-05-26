

public class largesmallvalue {


    public static int largesmallnum(int nums[]){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for( int i = 0; i < nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }

            if(smallest > nums[i]){
                smallest = nums[i];
            }

            
        }

        System.out.println("smallest is "+smallest);
        return largest;
    }
    public static void main(String args[]){
        
        int nums [] = {2, 3, 6, 4, 5};

        System.out.println("largest and the smallest number is "+ largesmallnum(nums));


    }
    
}
