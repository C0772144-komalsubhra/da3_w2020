package com.lambton;

public class Example {
    public static void main(String[] args) {
        int d[] = new int[]{20, 40, 30, 40, 50, 60};
        System.out.println(d.length);
        System.out.println("Array is:");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        int h = 0;
        int s = 0;

        for (int i = 0; i < d.length; i++) {
            int g = d[i];
            if (g > h) {
                s = g;
                h = g;

            } else {
                s = h;
            }
        }
        System.out.println("Maximum value is :" + s);

        int t = 0;
        for (int i = 0; i < d.length; i++) {
            int g = d[i];
            if (g < h) {
                s = g;
                h = g;
            } else {
                s = h;

            }
        }
        System.out.println("Minimum value is:" + s);

        for (int i = 0; i < d.length; i++) {
            int g = d[i];
            t = t + g;

        }
        System.out.println("Sum is :" + t);
        int j = d.length;
        System.out.println("Avg is :" + t / j);
        System.out.println("Reverse of array is :");

        for (int i = (d.length) - 1; i >= 0; i--) {
            System.out.println(d[i]);
        }
        System.out.println("Array of string is :");
        String str[] = new String[]{"komal", "nikita", "geet", "jasmine", "anmol", "macey", "manjeet", "anita", "aman", "kamal"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("hello world");


        String st[];
        st = new String[10];

        System.out.println("String is:");

        st[0] = "Canada";
        st[1] = "Australia";
        st[2] = "America";
        st[3] = "Argentina";
        st[4] = "Africa";
        st[5] = "New York";
        st[6] = "India";
        st[7] = "England";
        st[8] = "italy";
        st[9] = "dubai";

        for (int i = 0; i <st.length; i++) {
            System.out.println(st[i]);
        }
        System.out.println("...................");
        System.out.println("Reverse of string is :");
        String reverseStrings[] = new String[st.length];






    }





}
