import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("this is two number of " +  sum);

        // subtraction of a-b
        int sub= a-b;
        System.out.println("this is two number of "+ sub);

         // multiple
        int multi= a*b;
        System.out.println("this is two of " + multi);

        // divisible of a/b
        int div= a/b;
        System.out.println("this is two number of " + div);

        // modulo
        int mod= a%b;
        System.out.println("this is two num of " + mod);
    }
}
