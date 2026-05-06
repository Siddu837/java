

public class multiply {
    
    public static int multiplynum(int a , int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        int a = 5;
        int b = 6;
        int product = multiplynum(a , b);
        System.out.println("a * b = "+product);
    }
}
