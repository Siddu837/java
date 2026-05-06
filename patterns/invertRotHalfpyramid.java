public class invertRotHalfpyramid {
    
    public static void inRotHalfpyramid(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

            for( int j = 1; j <= i; j++){
                System.out.print(" "+j);
            }
            
            System.out.println();
        }

    }

    public static void numpyramid(int n){

        for( int i = 1; i <= n; i++){

            for(int j = 1; j <= n - i +1; j++){

                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    public static void floydsnumtri(int n){

        int count = 1;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void tri01(int n){
        
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){

        for(int i = 1 ; i <= n; i++){

            for(int j =1 ; j <= i; j++){
                System.out.print("* ");
            }

            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

           

            for( int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = n ; i >= 1; i--){

             for(int j =1 ; j <= i; j++){
                System.out.print("* ");
            }

            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

           

            for( int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void rhombus(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print("  ");
            }

            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    public static void hallowrhombus(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print("  ");
            }

            for(int j = 1; j<=n; j++){
                if(i==1||i==n||j==1||j==n){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
    }

    public static void diamond(int n){

        for(int i = 1; i<=n; i++){

            for(int j=1; j<=(n-i);j++){
                System.out.print("  ");
            }

            for(int j=1; j<= (2*i)-1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

         for(int i = n; i>=1; i--){

            for(int j=1; j<=(n-i);j++){
                System.out.print("  ");
            }

            for(int j=1; j<= (2*i)-1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("half pyramid");
        inRotHalfpyramid(4);
        System.out.println();
        System.out.println("number pyramid");
        numpyramid(4);
        System.out.println();
        System.out.println("floyds triangle");
        floydsnumtri(5);
        System.out.println();
        System.out.println("binary pyramid");
        tri01(5);
        System.out.println();
        System.out.println("Butterfly pattern");
        butterfly(4);
        System.out.println();
        System.out.println("Rhombus");
        rhombus(5);
        System.out.println();
        System.out.println("hallow rhombus");
        hallowrhombus(5);
        System.out.println();
        System.out.println("diamond pattern");
        diamond(5);
    }
}
