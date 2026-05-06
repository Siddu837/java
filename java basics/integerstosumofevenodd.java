import java.util.Scanner;

public class integerstosumofevenodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n to give n numbers");

        int n = sc.nextInt();
        int sumeven = 0;
        int sumodd = 0;

        for(int i = 0; i < n; i++){
            System.out.println("enter the number");
            int num = sc.nextInt();

            if(num % 2 == 0){
                sumeven+=num;
            }
            else{
                sumodd+=num;
            }

        }
        System.out.println("sum of even "+ " "+ sumeven);
        System.out.println("sum of odd "+ " "+ sumodd);
        sc.close();
    }
}
