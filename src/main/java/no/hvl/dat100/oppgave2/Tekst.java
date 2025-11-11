package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {
    private String tekst;
	// TODO: objektvariable 
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
        this.tekst = tekst;
	}
	
	public String getTekst() {
        return tekst;
	}

	public void setTekst(String tekst) {
		throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
