import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");


      // sum of first n natural number
//        int sum=0;
//        for (int i = 0; i <= n; i++) {
//            sum= sum+i;
//        }
//        System.out.println(sum);

        // divisible of n natural number

        // print a table of a number input by the user
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i*n);
//        }
            int input = 0;

            do{
                int marks= sc.nextInt();
                if(marks >=90 && marks <=100){
                    System.out.println("well done");
                } else if(marks >=60 && marks <=89){
                    System.out.println("very good");
                } else if(marks >=0 && marks <=59){
                    System.out.println("good");
                } else{
                    System.out.println("try to study");

                    System.out.println("if want to continue then press 1 or 0");
                    input = sc.nextInt();
                }
            } while(input==1);

    }
}
