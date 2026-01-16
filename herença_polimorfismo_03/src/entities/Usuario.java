package entities;

public abstract class Usuario {

	private String name;

	public Usuario() {
	}

	public Usuario(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String receberNotificacao(String mensagem);
	
	
	public void mostrarNome() {
		System.out.println("[" + getName() + "]");
	}
	
}
