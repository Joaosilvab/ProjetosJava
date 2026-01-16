package entities;

public class UsuarioAdministrador extends Usuario{


	public UsuarioAdministrador() {
		super();
	}
	
	public UsuarioAdministrador(String name) {
		super(name);
	}

	@Override
	public String receberNotificacao(String mensagem) {
		
		return getName()  
			   + "(ADM) recebeu: "
			   + mensagem
			   + "\n"
			   + getName()
			   + " registrou a notificação no log."
			   + "\n"
			   + getName()
			   + " disparou alerta geral.";  
	}

}
