package entity;

public class Studente extends Persona {
	
	private String nomeUniversita ;
	
	public Studente(int eta, String nome,String nomeUniversita) {
		super(eta, nome);
		this.nomeUniversita=nomeUniversita;
	}

	@Override
	public void infoGeneraly() {
		System.out.println("il nome del Studente � : " + this.getNome() + "l'eta � : "+this.getEta() + "  la sua universita si chiama : "+this.nomeUniversita);	
	}

}
