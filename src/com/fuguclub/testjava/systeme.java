package com.fuguclub.testjava;

import java.util.Scanner;

public class systeme {
    public static void main(String[] args) {

        double[] equation1 = {0, 0};
        double[] equation2 = {0, 0};

        Scanner equation10Scanner = new Scanner(System.in);
        System.out.println("Entrez le x de la première équation \n (y = Ax + b) Entrez le A.");
        equation1[0] = equation10Scanner.nextDouble();

        Scanner equation11Scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de la première équation \n (y = ax + B) Entrez le B.");
        equation1[1] = equation11Scanner.nextDouble();

        Scanner equation20Scanner = new Scanner(System.in);
        System.out.println("Entrez le x de la deuxième équation \n (y = Ax + b) Entrez le A.");
        equation2[0] = equation20Scanner.nextDouble();

        Scanner equation21Scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de la deuxième équation \n (y = ax + B) Entrez le B.");
        equation2[1] = equation21Scanner.nextDouble();

        System.out.println(equation2[1] + "-" + equation1[1] + "/" + equation1[0]+ "- " + equation2[0]);

        double doubleX = (equation2[1] - equation1[1]) / (equation1[0] - equation2[0]);

        double doubleY = equation1[0] + equation1[1];

        String response = (doubleX + "," + doubleY);

        System.out.println(response);

    }
}
