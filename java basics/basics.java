
import java.util.*;

public class basics {
    public static void main(String args[]){
        
        for(int i=5; i > 1; i--){
            for(int j=1; j<i ;j++){

            System.out.print("*");

            }
            System.out.print("\n");
        }

        int a = 19;
        int b = 23;
        int sum = a + b;
        System.out.println(sum);


        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        float num3 = sc.nextFloat();

        int sumofnum = num1 + num2;
        int sumofpro = num1 * num2;
        float area = 3.14f * num3 * num3;

        System.out.println(sumofnum);
        System.out.println(sumofpro);
        System.out.println(area);

        sc.close();

    }

    
}


