public class trappingwater {

    public static int trappedwater(int height[]){
        int n = height.length;
        int waterlevel;
        int trapedwater = 0;
        // leftboundry
        int left [] = new int[n];

        left[0] = height[0];

        for(int i = 1; i < n; i++){
            left[i] = Math.max(height[i], left[i-1]);

        }

        // rightboundry

        int right [] = new int[n];

        right[n-1] = height[n-1];

        for( int i = n-2; i >= 0; i--){
            right[i] = Math.max(height[i], right[i+1]);
        }
        // minofleft-right = waterlevel

        for( int i = 0; i<n; i++){
            waterlevel = Math.min(left[i], right[i]);

            // waterlevel - height of bar = trappedwater
            trapedwater += waterlevel - height[i];
        
        }
        return trapedwater;
    }

    public static void main(String args[]){
        int height [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedwater(height));
    }
}
