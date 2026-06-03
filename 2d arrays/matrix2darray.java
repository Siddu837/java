import java.util.Scanner;

public class matrix2darray {


    public static boolean arrays2d(int matrix[][], int key){

        for(int i = 0; i < matrix.length; i++){

            for(int j = 0; j< matrix[0].length; j++){

                if (matrix[i][j] == key){

                    System.out.print("found the key at index"+ "("+ i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("not found the key");
        return false;
        
    }

    public static void arrays2dmaxmin(int matrix[][]){

        int largest = Integer.MIN_VALUE;
        int small =Integer.MAX_VALUE;

        for(int i = 0; i < matrix.length; i++){

            for(int j = 0; j< matrix[0].length; j++){

                largest = Math.max(largest, matrix[i][j]);
                small = Math.min(small, matrix[i][j]);
                
            }
        }

        System.out.println("largest element in the matrix is " + largest);
        System.out.print("smallest element in the matrix is " + small);
        
    }

    public static void main(String args[]){

        int matrix [] [] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < matrix.length; i++){

            for(int j = 0; j < matrix[0].length; j++){

                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matrix.length; i++){

            for(int j = 0; j < matrix[0].length; j++){

                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
        sc.close();

        arrays2d(matrix, 0);

        arrays2dmaxmin(matrix);
    }



    
    
}
