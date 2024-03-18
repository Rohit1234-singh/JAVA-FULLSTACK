import java.util.Scanner;

public class FoundThexInindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of number");
        int size= sc.nextInt();
         int numbers[]=new int[size];

        for (int i = 0; i <size ; i++) {
            numbers[i]= sc.nextInt();
        }

        int x= sc.nextInt();

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]==x){
                System.out.println("X founder in the index "+i);
            }
        }


//        String numbers1[]= new String[size];
//        for (int i = 0; i <size ; i++) {
//            numbers1[i]= sc.next();
//        }
//
//        for (int i = 0; i < numbers.length ; i++) {
//            System.out.println("name "+ (i+1)+ " is "+ numbers1[i]);
//        }
//


    }
}
