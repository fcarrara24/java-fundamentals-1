package org.learning.festa_ferragnez;

import java.util.Arrays;
import java.util.Scanner;



public class FestaFerragnez {
    public static String toCamelCase(String str){
        String[] arrString = str.split(" ");
        for (int i = 0; i < arrString.length; i++) {
            String word = arrString[i];
            arrString[i] = word.substring(0,1).toUpperCase()+ word.substring(1).toLowerCase();
        }
        return String.join(" ", arrString);
    }

    public static void main(String[] args) {
        String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        System.out.println("come ti chiami?");
        //dichiaro lo scanner
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        //metto il nome in camel case
        nome = toCamelCase(nome);

        // trasformo in una lista
        boolean presente = Arrays.asList(invitati).contains(nome);

        System.out.println((presente)? "puo accedere ": "chi ti conosce?");

        sc.close();
    }
}
