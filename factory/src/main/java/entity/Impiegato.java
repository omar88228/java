package entity;

public class Impiegato extends Persona{
	
	private String azienda ;
	
	public Impiegato(int eta, String nome,String azienda) {
		super(eta, nome);
		this.azienda=azienda;
	}

	@Override
	public void infoGeneraly() {
		System.out.println("il nome del impiegato � : " + this.getNome() + "l'eta � : "+this.getEta() + "la sua azienda si chiama : "+this.azienda);
		
	}

}
