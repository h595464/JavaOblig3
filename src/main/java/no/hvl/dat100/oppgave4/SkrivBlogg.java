package no.hvl.dat100.oppgave4;

import no.hvl.dat100.oppgave3.Blogg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        File file = new File(mappe, filnavn);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            String innhold = samling.toString();
            writer.write(innhold);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}