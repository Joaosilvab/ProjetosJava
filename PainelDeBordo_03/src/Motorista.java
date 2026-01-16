

public class Motorista {
    private String nome;
    private Carro carroProprio;
    private String localizacao;

    public Motorista(String nome, Carro carroProprio, String localizacao) {
        this.nome = nome;
        this.carroProprio = carroProprio;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public Carro getCarroProprio() {
        return carroProprio;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
