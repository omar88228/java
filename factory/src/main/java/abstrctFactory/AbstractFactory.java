package abstrctFactory;

import entity.Animale;
import entity.Persona;

public abstract class AbstractFactory {
	
	public abstract Persona getPersona(String typoPersona,String nome ,int eta,String instituto);
	public abstract Animale getAnimale(String nome ,int numero,String typoAnimale);
}
