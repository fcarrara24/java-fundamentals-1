package org.learning.festa_ferragnez;

import java.util.Arrays;
import java.util.Scanner;



public class FestaFerragnez {

    public static void main(String[] args) {
        String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        System.out.println("come ti chiami?");
        //dichiaro lo scanner
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        //metto il nome in camel case
        String[] arrNome = nome.split(" ");
        for (int i = 0; i < arrNome.length; i++) {
            arrNome[i] = arrNome[i].substring(0,1).toUpperCase()+ arrNome[i].substring(1).toLowerCase();
        }
        nome = String.join(" ", arrNome);

        // trasformo in una lista
        boolean presente = Arrays.asList(invitati).contains(nome);

        System.out.println((presente)? "puo accedere ": "chi ti conosce?");

        sc.close();
    }
}
