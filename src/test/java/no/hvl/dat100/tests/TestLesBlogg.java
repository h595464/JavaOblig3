package no.hvl.dat100.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;
import no.hvl.dat100.oppgave3.Blogg;
import no.hvl.dat100.oppgave5.LesBlogg;

public class TestLesBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/test/java/no/hvl/dat100/tests/";

	private static String FILNAVN = "bloggkorrekt.dat";
	
	@Test
	public void testles() {
		
		Blogg samling = LesBlogg.les(MAPPE,FILNAVN);

		Tekst innlegg1 = new Tekst(1,"Ole Olsen","23-10","en tekst");
		Bilde innlegg2 = new Bilde(2,"Oline Olsen","24-10","et bilde","http://www.picture.com/oo.jpg");
		
		assertEquals(samling.getAntall(),2);
		assertTrue(samling.finnes(innlegg1));
		assertTrue(samling.finnes(innlegg2));
		
		System.out.println(samling.toString());
	}
	
}
