// NAME : ROHIT SINGH
// CONTACT : 6280283237
// EMAIL ID : rohit151852@gmail.com
//  ARRAYS

//        1. A
//        2. C
//        3. A
//        4. A
//        5. A
//        6. C
//        7. A
//        8. C
//        9. B
//        10. C
//        11. A
//        12. D
//        13. C
//        14. A
//        15. D




package com.Assigment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a= new int[]{2,43,66,92,3,5,13,123,432,44,78};
        int x=100;
        for (int i = 0; i < a.length ; i++) {
            if(a[i]>x){
                System.out.println("greater than value of a is : " +a[i]);
            }
        }

//        Scanner sc= new Scanner(System.in);
//        int num= sc.nextInt();
        int [] arr= new int[]{1,2,3,4,2,7,8,8,3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(" this is dublicate number in array "+arr[j]);
                }
            }
        }
    }
}
