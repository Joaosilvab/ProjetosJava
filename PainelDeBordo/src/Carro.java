
public class Carro extends Modelo implements Gerenciar {
	
	private String localizacao;
    private String proprietario; 
	private boolean isCarroDeTrabalho;
    
	public Carro(String modelo, String cor, String localizacao, String proprietario, boolean isCarroDeTrabalho) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.localizacao = localizacao;
		this.proprietario = proprietario;
		this.isCarroDeTrabalho = isCarroDeTrabalho; 
	}
	
	
	
    public Carro() {
	}



	void abrir(){
        this.porta = true;
    }
     void ligar(){
           if(this.porta == true){
            System.out.println("Cuidado porta " +
                    "do Carro Aberta!!!");
            System.out.println("Dando partida " +
                    "no carro...");
            this.ligado = true;
        } else{
            this.ligado = true;
            System.out.println("Dando partida no carro...");
        }
    }
    void fechar(){
          this.porta = false;
    }
     void desligar(){
           if(this.porta == true){
            System.out.println("Cuiadado porta do " +
                    "Carro Aberta!!!");
            System.out.println("Desligando o c" +
                    "arro...");
            this.ligado = false;
        } else{
            this.ligado = false;
            System.out.println("Desligando o carro...");
        }
    }
     void status(){
         System.out.println("Carro " + this.modelo + " de " +
                 "Cor " + this.cor + " Porta esta " +
                 "aberta? " + this.porta + " e esta" +
                 " ligado? " + this.ligado + " ");
     }
	@Override
	public String getLocalizacao() {
		return localizacao;
		 
	}
	@Override
	public String getProprietario() {
		return proprietario;
		
	}
	
	public boolean isCarroDeTrabalho() { 
		return isCarroDeTrabalho;
		
	}
	
	
}