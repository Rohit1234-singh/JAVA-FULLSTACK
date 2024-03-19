package com.opps;

class Student{
    String name;
    int age;
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
////  non parameterised con  Student(){
////        System.out.println("this is me");
////    }
//    Student(String name, int age){
//       this.name=name;
//       this.age= age;
//    }

    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+ " "+age);
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
      //  Student s1= new Student("rohit", 21);
        Student s1= new Student();
        s1.name="rohit";
        s1.age=21;
      s1.printInfo(s1.name, s1.age);

    }
}
