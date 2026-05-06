import java.util.Scanner;

public class cal {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        System.out.println("select any operation");
        System.out.println("1.+ \t 2.-\t 3.*\t 4./ \t 5.%");
        int op = sc.nextInt(); // or sc.next().charAt(0);
        switch(op){
            case 1:
                System.out.println("Additon"+" "+ (num1+num2));
                break;
            case 2:
                System.out.println("Subtract"+" "+ (num1-num2));
                break;
            case 3:
                System.out.println("multiply"+" "+ (num1*num2));
                break;
            case 4:
                System.out.println("division"+" "+ (num1/num2));
                break;
            case 5:
                System.out.println("module"+" "+ (num1 % num2));
                break;
            default:
                System.out.println("Invalid option");
        
        }
        sc.close();
    }
}
