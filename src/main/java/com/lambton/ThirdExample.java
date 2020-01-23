package com.lambton;


import sun.awt.geom.AreaOp;

import java.awt.*;

public class ThirdExample {
    public static void main(String[] args) {
        int a[];
        int []b;
        int c[]=new int[5];
        c[0] =10;
        c[1] = 20;
        c[2] =30;
        c[3] =40;
        c[4] =50;
        a = new int[2];
        a[0] =100;
        a[1]=200;
        int d[] = new int[]{1,2,3,4,5,6};
        System.out.println(d.length);
        for(int i=0;i<d.length;i++){
            System.out.println(d[i]);
        }

        int[] x,y;//both r array
        int x2,y2[];
        int x3[],y3;
        int[]x4, y4[];//1  1Darray,2 - 2D array
        y4 = new int[3][3];
        System.out.println("using compact for");

        for(int p:d){
            System.out.println(p);

        }

    }

}
