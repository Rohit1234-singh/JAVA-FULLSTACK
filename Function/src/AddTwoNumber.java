import java.util.Scanner;

public class AddTwoNumber {
   // public static int sumTwoNumber(int a,int b){
       // int sum= a+b;
       // return sum;
   // }

    public static int multiplyTwo(int a,int b) {
        int multi = a * b;
        return multi; // we can directly calculate the two number
    }
    public static void main(String[] args) {

        Scanner num= new Scanner(System.in);
        int a= num.nextInt();
        int b=num.nextInt();
//       int sum= sumTwoNumber(a,b);
//        System.out.println(sum);

        int multi= multiplyTwo(a,b);
        System.out.println(multi);
    }
}
