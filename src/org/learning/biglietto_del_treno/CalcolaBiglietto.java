package org.learning.biglietto_del_treno;


import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("inseriore il numero di km da percorrere");
        int km = Integer.parseInt(sc.nextLine());
        System.out.println("inseriore  l'eta del passeggero");
        int eta =  Integer.parseInt(sc.nextLine());
        double coefficienteEta = eta > 65 ? 0.6 : (eta<18 ? 0.8 : 1);
        double prezzo = 0.21 * km * coefficienteEta;

        System.out.println("la tua tariffa sarà "+String.format("%.2f",prezzo)+" euro");
    }
}
