package entities;

public class UsuarioGratuito extends Usuario{

	
	public UsuarioGratuito() {
		super();
	}
	

	public UsuarioGratuito(String name) {
		super(name);
	}


	@Override
	public String receberNotificacao(String mensagem) {
		
		return getName()  
			   + " recebeu: "
			   + mensagem;  
	}
  
}
