package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        try {

            File fil = new File(mappe, filnavn);

            if (fil.getParentFile() != null) {
                fil.getParentFile().mkdirs();
            }

            PrintWriter writer = new PrintWriter(fil);
            writer.print(samling.toString());
            writer.close();

            return true;

        } catch (FileNotFoundException feil) {
            System.out.println("Fil ikke funnet: " + feil.getMessage());
            return false;
        }
    }
}

