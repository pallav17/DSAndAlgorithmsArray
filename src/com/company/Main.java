package com.company;

import java.io.Console;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Weakness of Array => THey have a static memory.
        // Also adds, remove and copying one array to other can be costly.

      /*  int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;*/

        int[] numbers = {10,20,30};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);



        Array array = new Array(5);

        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(5);
        array.insert(6);
        array.insert(7);




        array.removeAt(2);
        array.print();








    }
}
