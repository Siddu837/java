
public class printsubarray {

    public static void Subarrayprint(int nums[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int prefix [] = new int[nums.length];

        prefix[0] = nums[0];

        for(int i = 1; i< prefix.length;i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for( int i = 0; i <= nums.length-1; i++){

            int start = i;

            for(int j = i ; j <= nums.length-1; j++){
                
                int end = j;
                // int l = 0;
                // currsum = 0;
                
                // for( int k = start; k <= end; k++){
                   

                //     // System.out.print(nums[k]+ " ");
                //     // l += nums[k];
                //     currsum += nums[k];

                // }
                // // System.out.print("sum of subarry "+ l);
                // System.out.print(currsum);

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum < currsum){
                    maxsum = currsum;
                }

                // System.out.println();

            }

            // System.out.println();
        }
        System.out.println("max subarray is "+ maxsum);
    }


    public static void kadanes(int nums[]){
        
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i = 0; i< nums.length; i++){
            currsum = currsum + nums[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("sum of max subarray is "+ maxsum);
    }
    public static void main(String args[]){

        int nums [] = {2, 4, 6, 8, 10};
    
        // Subarrayprint(nums);
        kadanes(nums);
    
}

}

//  brute force solution time complexity is O(n3)
