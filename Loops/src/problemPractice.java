import java.util.Scanner;

public class problemPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();

        // find the odd number less than 10
        for (int i = 1; i <=10 ; i+=2) {
            System.out.println(i);
            }

        //  find the even number <= 10
        for (int i=2; i<=10; i+=2){
            System.out.println(i);
        }


    }
}
