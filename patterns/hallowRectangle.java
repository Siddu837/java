public class hallowRectangle {
    
    public static void hallowRec(int rows, int colns){

        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= colns; j++){

                if(i == 1 || i == rows || j == 1|| j == colns){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        hallowRec(4, 5);
    }
}
