package app;

import abstrctFactory.AbstractFactory;
import abstrctFactory.FactoryCreator;
import entity.Animale;
import entity.Persona;
import util.View;

public class Main {

	public static void main(String[] args) {
//		String typoPersona = View.getStringNotNull("inserisci typo della persona impiegato o studente");
//		String nome =View.getStringNotNull("inserisci il nome ");
//		int eta =  View.getIntNotNull("inserisci l'eta ");
//		String organizzazione = View.getStringNotNull("inserisci l'organizzazione dove appartiene la persona");
//		FactoryPersona factoryPersona = new FactoryPersona();
//		Persona persona= factoryPersona.getPerona(typoPersona, nome, eta, organizzazione);
//		persona.infoGeneraly();

		AbstractFactory factory = FactoryCreator.getFactory("animale");
		String typoAnimale = View.getStringNotNull("inserisci il typo del aimale pesce o mammifero ");
		String nomeAnimale = View.getStringNotNull("inserisci il nome ");
		int numero = View.getIntNotNull("inserisci il numero di zampe ");
		Animale animale = factory.getAnimale(nomeAnimale, numero, typoAnimale);
		animale.infoGenerali();
		AbstractFactory factory1 = FactoryCreator.getFactory("persona");
		String typoPersona = View.getStringNotNull("inserisci typo della persona impiegato o studente");
		String nome = View.getStringNotNull("inserisci il nome ");
		int eta = View.getIntNotNull("inserisci l'eta ");
		String organizzazione = View.getStringNotNull("inserisci l'organizzazione dove appartiene la persona");
		Persona persona = factory1.getPersona(typoPersona, nome, eta, organizzazione);
		persona.infoGeneraly();
	}

}
