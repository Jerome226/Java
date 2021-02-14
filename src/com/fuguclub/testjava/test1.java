package com.fuguclub.testjava;

public class test1 {
    public static void main(String[] args) {

        boolean day = true;
        boolean gentil = true;
        String[] message = {"bon matin.", "bonsoir"};

        if(day && gentil){
            System.out.println("Cette personne est gentille alors il vous souhaite une bonne journée.");
        } else if(!day && gentil){
            System.out.println("Cette personne est gentille alors il vous souhaite une bonne soirée.");
        } else {
            System.out.println("Cette personne n'est pas gentille");
        }

    }
}
