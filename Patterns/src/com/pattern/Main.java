package com.pattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Scanner sc= new Scanner(System.in);
//        int size= sc.nextInt();

       int row= 4;
        int col= 5;
//              this int use for solid and hallow now see the 40 line question okay
   // SOLID RECTANGLE

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=col; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // HALLOW RECTANGLE

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if(i == 1 || j == 1 || i == row || j == col){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // HALF PYRAMID
     //  int row= 4;
        for (int i = 1; i <=col ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        int n=6;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // INVERTED HALF PYRAMID
        //outer loop
//        for (int i = 1; i <=row; i++) {
//            // inner loop -> for space
//            for (int j = 1; j <=row-i ; j++) {
//                System.out.print(" ");
//            }
        // inner loop for stars
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*" );
//
//            }
//
//            System.out.println();
//        }

        //INVERTED HALF PYRAMID
        for (int i =row; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            // PRINT NUMBER PATTERN
//        int n=6;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }


//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <n-i+1; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
    }
}
