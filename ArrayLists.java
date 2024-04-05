package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
	// write your code here
       int n=10;
        ArrayList<Integer> arr1= new ArrayList<>();
//        ArrayList<Integer> arr2= new ArrayList<>(n);
//
//        System.out.println("arr1"+ arr1);
//        System.out.println("arr1"+ arr1);
//        for (int i = 1; i <=n; i++) {
  //          arr1.add(i);
//            arr2.add(i);
//        }
//        System.out.println("array1"+ arr1);
//        System.out.println("array2" + arr2);
// add the element
        arr1.add(0);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        System.out.println(arr1);

        // get
        int element= arr1.get(1);
        System.out.println(element);

        // add element in between

        arr1.add(1,1);
        arr1.add(7,7);
        System.out.println(arr1);

        // set element
        arr1.set(4,5);
        System.out.println(arr1);

        // delete element
        arr1.remove(5);
        System.out.println(arr1);

        // size

        int size= arr1. size();
        System.out.println(size);

        // loops
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(" "+ arr1.get(i));
        }
        System.out.println();

        // shorting
        Collections.sort(arr1)  ;
        System.out.println(arr1 );

    }
}
