import java.util.Scanner;

public class FactorialNumber {
    public static void factorial(int n){
        // apply loops
        int factorial=1;
        for (int i = n; i>=1 ; i--) {
            factorial= factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        factorial(n);
    }
}
