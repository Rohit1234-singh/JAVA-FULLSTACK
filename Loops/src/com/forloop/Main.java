package com.forloop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner lp= new Scanner(System.in);
        System.out.println("Enter the less than 10 number here");
        int lop= lp.nextInt();

        // for loop
//        for (int i = 1; i <=10 ; i++) {
//          //  lop= i+2;// sum number
//            System.out.println(i);
//        }

        // while loop
//        int i=0;
//        while (i<9){
//            System.out.println(i);
//            i++;
//        }

        // do while loop

        int a=0;
        do{
            System.out.println(a);
            a++;

        } while(a<10);

    }
}
