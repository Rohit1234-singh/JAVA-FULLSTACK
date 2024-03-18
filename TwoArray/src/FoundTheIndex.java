import java.util.Scanner;

public class FoundTheIndex {
    public static void main(String[] args) {
        Scanner mt= new Scanner(System.in);
        // input for row and columns
        int rows= mt.nextInt();
        int cols= mt.nextInt();

        int[][] matrix=new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]= mt.nextInt();

            }
        }
        int x= mt.nextInt();

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j]==x){
                    System.out.print("you founded the matric of index ("+ i+","+j+")");
                }
//                System.out.print(matrix[i][j]+ " ");
            }
           // System.out.println();
        }
    }
}
