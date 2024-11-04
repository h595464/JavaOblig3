package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;

public class Blogg {
    private Innlegg[] innleggTabell;
    private int nesteledige;

    public Blogg() {
        Innlegg[] innleggTabell = new Innlegg[19];
    }

    public Blogg(int lengde) {
        innleggTabell = new Innlegg[lengde];
        nesteledige = 0;
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
            if (innleggTabell[i].getId() == innlegg.getId()) {
                return i;
            }
        }
        return -1;
    }

    public boolean finnes(Innlegg innlegg) {
        for (int i = 0; i < innleggTabell.length; i++) {
            if (innleggTabell[i].getId() == innlegg.getId()) {
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
        for (int i = 0; i < innleggTabell.length - 1; i++) {
            if (!finnes(innlegg)) {
                if (ledigPlass()) {
                    innleggTabell[i] = innlegg;
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        throw new UnsupportedOperationException(TODO.method());
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