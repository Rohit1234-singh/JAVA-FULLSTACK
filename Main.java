package com.Assgmt;

import java.util.Scanner;

class Student{
     int sid;
     String name;
     String phn;

     static String Course;

     // parameterisez constructor
      Student(int id, String nm, String no){
          sid= id;
          name=nm;          // we can use this keyword also like int
          phn= no;
      }

      static void Courses(String Coursename ){
          Course=Coursename;
     }

     void display(){
         System.out.println("Student id "+ sid);
         System.out.println("Student name "+ name);
         System.out.println("Student phn "+ phn);
         System.out.println("Student course "+ Course);
     }

 }

public class Studnt {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Enter Your Details");
//        Scanner sc= new Scanner(System.in);
//        String s1= sc.next();
        Student.Courses("Java FullStack Developer");

        Student s= new Student(830,"Rohit Singh","6280283237");
        Student s2= new Student(530,"Abishek","7510836102");
        Student s3= new Student(270,"Mohan","8978535798");
        Student s4= new Student(880,"Mikha jena","6370712938");
        Student s5= new Student(860,"Tusar Lohara","8249010608");
        Student s6= new Student(865,"Blesson","7724007491");
        s.display();
        System.out.println();
        s2.display();
        System.out.println();
        s3.display();
        System.out.println();
        s4.display();
        System.out.println();
        s5.display();
        System.out.println();
        s6.display();
    }
}
