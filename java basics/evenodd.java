import java.util.Scanner;

public class evenodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num +" "+"num is even");
        }
        else{
            System.out.println(num +" "+ "num is odd");
        }

        sc.close();

    }
}
