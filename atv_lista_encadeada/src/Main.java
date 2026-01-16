
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserir("São Paulo");
        lista.inserir("Rio de Janeiro");
        lista.inserir("Belo Horizonte");

        lista.exibir();

        lista.remover("Rio de Janeiro");
        lista.exibir();

        lista.remover("Curitiba"); 
    }
}
