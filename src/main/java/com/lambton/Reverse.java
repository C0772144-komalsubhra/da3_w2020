package com.lambton;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {


    String[] my_array1 = {
            "India", "Australia"};
  System.out.println("Original array : "+Arrays.toString(my_array1));
   for(int i = 0; i < my_array1.length / 2; i++)
    {
        String temp = my_array1[i];
        my_array1[i] = my_array1[my_array1.length - i - 1];
        my_array1[my_array1.length - i - 1] = temp;
    }
    System.out.println("Reverse array : "+Arrays.toString(my_array1));
}
}
