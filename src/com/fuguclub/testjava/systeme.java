package com.fuguclub.testjava;

public class systeme {
    public static void main(String[] args) {
        int x = 2;
        int b = 3;
        int a = 2;

        int x2 = 2;
        int b2= 2;
        int a2 = 2;

        int ax = a * x;
        int ax2 = a2 * x2;

        if (b >= b2){
            b -= b2;
        } else {
            b2 -= b;
        }

        if (ax >= ax2){
            ax -= ax2;
        } else {
            ax2 -= ax;
        }

        System.out.println(ax + b + "et" + ax2 + b2);

    }
}
