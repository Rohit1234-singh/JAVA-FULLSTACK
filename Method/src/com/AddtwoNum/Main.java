package com.AddtwoNum;

import java.util.Scanner;

public class Main {
    int AddTwoNumber(int a, int b){
         int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
	// write your code here
        Main obj= new Main();
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Print the two sum number");
      int ans=  obj.AddTwoNumber(a,b);
        System.out.println(ans);
    }
}
