
public class binarysearch {

    public static int binarysearchnum(int nums[], int key){
        int start = 0, end = nums.length - 1;

        while( start <= end){

            int mid = (start + end)/2;

            if( nums[mid] == key){
                return mid;
            }
            if(nums[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String args[]){

        int nums [] = { 2, 4, 5, 8, 9};
        int key = 8;
        int index = binarysearchnum(nums, key);
        if(nums[index]==key){
            System.out.println("the index is "+index);
        }
        else{
            System.out.println("the index is not found");
        }
        
    }
    
}

// time complexity of Binary search is 
// O(log n) because it divides the array to n/2 , n/4.. n^k/2