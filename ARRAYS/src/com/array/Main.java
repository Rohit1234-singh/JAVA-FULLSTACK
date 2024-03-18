package com.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int number[]= new int[size];
//        int[] marks= new int[4];
//        marks[0]=90;
//        marks[1]=98;
//        marks[2]= 87;
//        marks[3]=99;
//        System.out.println(marks[1]);
//        System.out.println(marks[0]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
        for (int i = 0; i <size ; i++) {
            number[i]= sc.nextInt();
        }
        int X= sc.nextInt();
        for (int i = 0; i <number.length; i++) {
           if(number[i]== X){
               System.out.println("X found at index" + i);
           }
        }
    }
}
