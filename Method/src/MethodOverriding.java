public class MethodOverriding {
//        static void num(int[] arr){  1.1 topic
//            arr[3]=99;
//        }

    // METHOD OVERRIDING IN JAVA
    static void foo(){
        System.out.println("How are man");
    }
    static void foo(int a){
        System.out.println("i'm Good man" + a + " yeah" );
    }

    public static void main(String[] args) {
//        int [] marks={56,90,89,75,60,76}; // we code for understand the arr of marks can chage  this is not a method overrriding
//        num(marks);
//        System.out.println("this marks will change " + marks[3]); // this is 1.1 topic see up


        // METHOD OVERRIDING IN JAVA
        foo();
      // foo(a:200);
    }
}
