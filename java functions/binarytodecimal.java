
public class binarytodecimal {
    
    public static void binDec(int binNum){

        int mynum = binNum;
        int lastdigit = 0;
        int pow = 0;
        int deciNum = 0;


        while(binNum > 0){
            lastdigit = binNum % 10;

            deciNum = deciNum + (lastdigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
            
        }
        System.out.println("the decimal no of "+ mynum + " = "+ deciNum);
    }

    public static void decitobin(int num){
        int pow = 0;
        int bin = 0;
        int n = num;
        while(num > 0){
            int rem = num % 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            pow++;
            num = num/2;
        }
        System.out.println("binary of "+ n +" is "+ bin);
    }
    public static void main(String args[]){
        binDec(1110);
        decitobin(5);
    }
}
