package unique;

import java.util.Scanner;

public class unique {
    static int arr(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int sum=-1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                sum=arr[i];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int[] num= new int[n];

        System.out.println("Enter the number of element " +n);
        for (int i = 0; i < n; i++) {
            //arr[]
        }
    }
}
