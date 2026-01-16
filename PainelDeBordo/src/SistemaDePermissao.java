
public class SistemaDePermissao {
    public static boolean podeDirigir(Motorista motorista, Carro carro) {
    	
        if (carro.getProprietario().equals(motorista.getNome())) {
            return true;
        }
      
        if (carro.getLocalizacao().equals(motorista.getLocalizacao())) {
            return true;
        }

        if (!carro.getProprietario().equals(motorista.getNome()) && !carro.isCarroDeTrabalho()) {
            return true;
        }

        return false;
    }
}
     