package com.Stringss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        String str="ROhit singh";
//        System.out.println(str);

        // Using input from the user
        Scanner sc= new Scanner(System.in);
//        String name= sc.nextLine();
//        System.out.println(name);

        // Concatination Strings
//                 String fname= sc.nextLine();
//                 String lname= sc.nextLine();
//                 String concatination = fname +" "+ lname;
//        System.out.println(concatination);

        // Length of Strings
//        String name= "Rohit";
//        String name1= "Singh";
//        String fullname= name+" " + name1;
//        System.out.println("this is length of strings "+ fullname.length());
//        System.out.println(fullname.charAt(2)); // output : h
//        System.out.println(fullname.toUpperCase()); // output : ROHIT SINGH
//        System.out.println(fullname.toLowerCase()); // output : rohit singh

        // use charAt();

//        for (int i = 0; i < fullname.length(); i++) {
//            System.out.print(fullname.charAt(i));
//        }

        // Campare the string

        // S1>S2 = +ve value
        // S1==S2 = 0
        // S1<S2 = -ve value

//        String name="Rihit";
//        String name1="Singh";
//        if(name.compareTo(name1)==0){
//            System.out.println("Strins are equal to eachother");
//        } else{
//            System.out.println("String are not equal");
//        }

                 // SUBSTRING
        String sent= "My name is Rohit Singh";
        String na= sent.substring(11,sent.length());
        System.out.println(na);

        // ParseInt method
        String str="342";
         int name=Integer.parseInt(str);
        System.out.println(name);

        int num=1343;
        String n=Integer.toString(num);
        System.out.println(n.length());

        char ch[]={'r','o','h','i','t'};
        String str1= new  String(ch);
        System.out.println(str1);



    }
}
