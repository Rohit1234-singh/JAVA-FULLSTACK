import java.util.Scanner;

public class PrimeNumber {
    public static int primeNumber(int n){
        for (int i = 2; i <n ; i++) {
            if(n%2==0){
                System.out.println("this is prime numbber" + i);

            }

        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        primeNumber(num);
    }
}
