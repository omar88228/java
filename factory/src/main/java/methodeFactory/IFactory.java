package methodeFactory;

import entity.Persona;

public interface IFactory {
	Persona getPerona(String TypoPersona,String nome ,int eta,String instituto);
}
