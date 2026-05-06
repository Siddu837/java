import java.util.Scanner;

public class taxcal {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();

        if(income < 500000){
            System.out.println("Tax is 0%"+" "+ income);

        }
        else if(income <= 1000000){
            System.out.println("tax is 20% "+ " "+ (int) (income*0.2));
        }
        else{
            System.out.println("tax is 30%"+" "+ (int) (income*0.3));
        }
        sc.close();

    }
    
}
