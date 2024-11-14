package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;

import java.util.Arrays;

public class Blogg {
    private final Innlegg[] innleggTabell;
    private int nesteledige;

    public Blogg() {
        this.innleggTabell = new Innlegg[20];
    }

    public Blogg(int lengde) {
        this.innleggTabell = new Innlegg[lengde];
        this.nesteledige = 0;
    }

    public int getAntall() {
        int lagret = 0;
        for (Innlegg innlegg : innleggTabell) {
            if (innlegg != null) {
                lagret += 1;
            }
        }
        return lagret;
    }

    public Innlegg[] getSamling() {
        return innleggTabell;

    }

    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < innleggTabell.length; i++) {
            if (innleggTabell[i] != null && innleggTabell[i].getId() == innlegg.getId()) {
                return i;
            }
        }
        return -1;
    }

    public boolean finnes(Innlegg innlegg) {
        for (int i = 0; i < innleggTabell.length; i++) {
            if (innleggTabell[i] != null && innleggTabell[i].getId() == innlegg.getId()) {
                return true;
            }
        }
        return false;
    }


    public boolean ledigPlass() {
        for (int i = 0; i < innleggTabell.length; i++) {
            if (innleggTabell[i] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean leggTil(Innlegg innlegg) {
        if (ledigPlass() && !finnes(innlegg)) {
            for (int i = 0; i < innleggTabell.length; i++) {
                if (innleggTabell[i] == null) {
                    innleggTabell[i] = innlegg;
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        //kanskje en litt dårlig måte å gjøre det på men jaja
        String StrengFør = getAntall() + "\n" + Arrays.toString(getSamling());
        String FixetStreng = StrengFør.replaceAll(", ", "");
        String StrengFix2 = FixetStreng.replace("[", "");
        return StrengFix2.replace("]", "");
    }

    // valgfrie oppgaver nedenfor

    public void utvid() {
        throw new UnsupportedOperationException(TODO.method());
    }

    public boolean leggTilUtvid(Innlegg innlegg) {

        throw new UnsupportedOperationException(TODO.method());

    }

    public boolean slett(Innlegg innlegg) {

        throw new UnsupportedOperationException(TODO.method());
    }

    public int[] search(String keyword) {

        throw new UnsupportedOperationException(TODO.method());

    }
}