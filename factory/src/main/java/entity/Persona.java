package entity;

public abstract class Persona {
	
	private int eta ;
	private String nome ;
	
	public abstract void infoGeneraly();
	
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Persona(int eta, String nome) {
		super();
		this.eta = eta;
		this.nome = nome;
	}
	
}
