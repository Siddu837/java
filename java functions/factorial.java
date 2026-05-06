

public class factorial {
    
    public static int factorialn(int n){

        int fact = 1;

        for(int i = 1; i <= n; i++ ){
            
            fact *= i;
        }

        return fact;
        

    }

    public static int binCoeff(int n , int r){

        int fact_n = factorialn(n);
        int fact_r = factorialn(r);
        int factnmr = factorialn(n - r);

        int bincoeff = fact_n/ (fact_r * factnmr);

        return bincoeff;

    }


    public static void main(String args[]){
        System.out.println(binCoeff(5, 2));
        
    }
}
