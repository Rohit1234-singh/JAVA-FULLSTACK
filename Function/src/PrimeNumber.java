import java.util.Scanner;

public class PrimeNumber {
    public static int primeNumber(int n){
        if(n%2==0){
            System.out.println("this is prime"+n);
        } else{
            System.out.println("this is not prime number");
        }
        return n;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        primeNumber(n);
    }
}
