package org.learning.biglietto_del_treno;


import java.util.Scanner;

public class CalcolaBiglietto {
    public static int getInteger() {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        do {
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Inserire un numero valido");
                scan.nextLine(); // Consuma l'input non numerico
            }
        } while (!valid);
        return number;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        System.out.println("inseriore il numero di km da percorrere");
        int km = CalcolaBiglietto.getInteger();
        //int km = Integer.parseInt(sc.nextLine());
        System.out.println("inseriore  l'eta del passeggero");
        int eta = CalcolaBiglietto.getInteger();
        //int eta =  Integer.parseInt(sc.nextLine());
        double coefficienteEta = eta > 65 ? 0.6 : (eta<18 ? 0.8 : 1);
        double prezzo = 0.21 * km * coefficienteEta;

        System.out.println("la tua tariffa sarà "+String.format("%.2f",prezzo)+" euro");
    }
}
