import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.*;
public class ArraytoListAndListToArray {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        Integer[] arrayFromList = new Integer[list.size()];
        arrayFromList = list.toArray(arrayFromList);
        System.out.print("Array to list: ");
        for (int i = 0; i < arrayFromList.length; i++) {
            System.out.print(arrayFromList[i] + " ");
        }
        System.out.println();


        String[] array = {"Rohit", "Mikha", "Tushar"};
        List<String> listFromArray = Arrays.asList(array);
        System.out.println("List to array: " + listFromArray);


    }
}



