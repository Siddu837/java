import java.util.Scanner;

public class whileprime1ton {
    public static void main(String args[]){

         Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
         int n = sc.nextInt();
        int i = 2;
         while(i <= n){
            if(i%2!=0 && i%3!=0){
                System.out.println("prime"+ i);
            }
    
            i++;
         }
         sc.close();

    }
}
