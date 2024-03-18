import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int number[]= new int[size];

        //        int number[]= new int[4];
//        number[0]=43;
//        number[1]=23;
//        number[2]=4423;
//        number[3]=24;
//        System.out.println(number[0]);
//        System.out.println(number[1]);  // this is for understand how to find the array oaky;
//        System.out.println(number[2]);
//        System.out.println(number[3]);


        // we can also write like this
//        int number[]={3,5,2,5,2};
//        for (int i = 0; i < 5; i++) {
//           // System.out.println(number[i]);
//            System.out.print(number[i]);
//        }

            // input for user
        for (int i = 0; i <size ; i++) {
            number[i]= sc.nextInt();
        }

        // output for user
        for (int i = 0; i <size ; i++) {
            System.out.print(number[i]);
        }


    }
}
