package entities;

public class UsuarioPremium extends Usuario {
	

	public UsuarioPremium() {
		super();
	}

	
	public UsuarioPremium(String name) {
		super(name);
	}


	@Override
	public String receberNotificacao(String mensagem) {
	
		return getName()  
			   + " recebeu com prioridade: "
			   + mensagem
			   + "\n"
			   + getName()
			   + " Confirmou leitura.";  
	}

}
