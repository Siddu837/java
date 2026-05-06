import java.util.Scanner;

public class starpattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num");
        int num = sc.nextInt();
        System.out.println("star pattern");
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("inverted star pattern");
        for(int i = 1; i <= num;i++){
            for(int j = num; j >= i; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
