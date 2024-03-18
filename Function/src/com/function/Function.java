package com.function;
 import java.util.*;

public class Function {

     public static boolean  isPrime(int n){
         boolean prime = true;
         if(n<=1){
             return false;
         }
         for(int i=2;i<n;i++){
             if(n%i==0){
                 prime = false;
             }else{
                 prime = true;
             }
         }
         return prime;
    //public static void printName(String name){
      //  System.out.println(name);
       // return;
    //}

    // Question 1
    // calculate the two number a and b or multiple with two num
//    public static int Calmul(int a, int b){
//        int mul= a*b; // we can apply any operation like sum diff etc..
//        return mul;
//    }

//    public static void printFactorial(int n){
//         int factorial= 1;
//        for(int i=n; i>=1; i--){
//            factorial= factorial*i;
//
//        }
//        System.out.println(factorial);
//        return;
//    }
   // public static void main(String[] args) {
	// write your code here
    //    Scanner sc= new Scanner(System.in);
//        String name=sc.next();
//
//        printName(name);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//
//         int mul= Calmul(a,b);
//        System.out.println(mul);

//        int n=sc.nextInt();
//        printFactorial(n);



   // }
}
}
