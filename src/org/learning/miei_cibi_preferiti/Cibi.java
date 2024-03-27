package org.learning.miei_cibi_preferiti;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Cibi {
    public static void main(String[] args) {
        String[] cibi = {"pizza", "kebap", "sushi", "paccheri ai gamberi", "spaghetti al sugo"};
        int media = cibi.length/ 2;

        //cibo preferito
        System.out.println("cibo preferito:      "+cibi[0]);
        System.out.println("cibo meno preferito  "+cibi[cibi.length-1]);
        System.out.println("cibo medio preferito "+cibi[media]);
    }
}
