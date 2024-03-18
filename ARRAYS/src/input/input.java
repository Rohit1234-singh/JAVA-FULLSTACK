package input;

import java.util.Scanner;

public class input {
  static int TwoSum(int[] arr, int target){
//        int num= arr.length;
//        int sum=0;
      int sum=0;
      int num=arr.length;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                //  for (int k = j+1; k <num ; k++) {
                if (arr[i] + arr[j] == target) {
                    sum++;
                }
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of array");
        int n= sc.nextInt();
        int[] arr= new int[n];

        System.out.println("Enter the " + n + "  of Array");

//        for (int i = 0; i < nums.length; i++) {
//            nums[i]= sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(nums[i] +" ");
//        }

        for (int i = 0; i <n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the sum");
        int target = sc.nextInt();
        System.out.println(TwoSum( arr,target));
    }
}
