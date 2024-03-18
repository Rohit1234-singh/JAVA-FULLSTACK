package com.twoarray;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] number = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               number[i][j]= sc.nextInt();
            }
        }
       //  output

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        // Question 2
//        int x= sc.nextInt();
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if(number[i][j]==x){
//                    System.out.println(" X is founded at the exact location (" + i+ "," + j +")");
//                }
//            }
//        }


        // Question taking a matrix print the element

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                number[i][j] = sc.nextInt();
//            }
//        }
//            for (int i = 0; i < row; i++) {
//                for (int j = 0; j < col; j++) {
//                    System.out.print(number[i][j]+" ");
//                }
//                System.out.println();
//            }
//        int x = sc.nextInt();
//        for (int i = 0; i < row; i++) {
//
//            for (int j = 0; j < col; j++) {
//                if(number[i][j] ==x){
//                    System.out.println("x is  founded this locatin("+i+"," + j +") ");
//                }
//            }
//        }

            //        int n = sc.nextInt();
            //        int m = sc.nextInt();
            //        int[][] number = new int[n][m];
            //        int matrix[][] = new int[n][m];
            //        for(int i=0; i<n; i++) {
            //            for(int j=0; j<m; j++) {
            //                matrix[i][j] = sc.nextInt();
            //            }
            //        }
            //
            //
            //        System.out.println("The Spiral Order Matrix is : ");
            //        int rowStart = 0;
            //        int rowEnd = n-1;
            //        int colStart = 0;
            //        int colEnd = m-1;
            //
            //
            //        //To print spiral order matrix
            //        while(rowStart <= rowEnd && colStart <= colEnd) {
            //            //1
            //            for(int col=colStart; col<=colEnd; col++) {
            //                System.out.print(matrix[rowStart][col] + " ");
            //            }
            //            rowStart++;
            //
            //
            //            //2
            //            for(int row=rowStart; row<=rowEnd; row++) {
            //                System.out.print(matrix[row][colEnd] +" ");
            //            }
            //            colEnd--;
            //
            //
            //            //3
            //            for(int col=colEnd; col>=colStart; col--) {
            //                System.out.print(matrix[rowEnd][col] + " ");
            //            }
            //            rowEnd--;
            //
            //
            //            //4
            //            for(int row=rowEnd; row>=rowStart; row--) {
            //                System.out.print(matrix[row][colStart] + " ");
            //            }
            //            colStart++;
            //
            //
            //            System.out.println();
            //        }
//                            int row= sc.nextInt();
//                            int col= sc.nextInt();
//                         int [][] num= new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                num[i][j]= sc.nextInt();
//            }
//        }
//        int x= sc.nextInt();
//        int y= sc.nextInt();
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if( num [i][j]==x){
//                    System.out.println("X is founded in the location ("+i + ","+j+")");
//                } else if( num [i][j]==y){
//                    System.out.println("X is founded in the location ("+i + ","+j+")");
//                } else{
//                    System.out.println(" X and Y is not in the matrix ");
//                }
//
//            }
//
//        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j]= sc.nextInt();
            }
        }

         int x= sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //System.out.print(number[i][j] + " ");
                if( number[i][j]==x){
                    System.out.println(" X is founded in the maxtrix ("+i+" , "+j+")");
                }
            }
            System.out.println();
        }

    }
    }
