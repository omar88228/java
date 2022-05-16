package entity;

public abstract class Animale {
	
	private String nome ;
	
	public Animale(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public abstract void infoGenerali();
}
