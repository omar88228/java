package methodeFactory;

import entity.Impiegato;
import entity.Persona;
import entity.Studente;

public class FactoryPersona implements IFactory {

	@Override
	public Persona getPerona(String TypoPersona,String nome ,int eta,String instituto) {
		if (TypoPersona.equalsIgnoreCase("studente")) {
			return new Studente(eta, nome, instituto);
		}
		if(TypoPersona.equalsIgnoreCase("impiegato")) {
			return new Impiegato(eta, nome, instituto);
		}
		return null;
	}
	
}
