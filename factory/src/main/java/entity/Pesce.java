package entity;

public class Pesce extends Animale {
	
	private int numeroPine ;
	
	public Pesce(String nome , int numeroPine) {
		super(nome);
		this.numeroPine=numeroPine;
	}

	@Override
	public void infoGenerali() {
		System.out.println("il nome del pesceo � : " + this.getNome() + " e possede " + numeroPine+ " pine");
	}

}
