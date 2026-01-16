
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserir("Curitiba");
        lista.inserir("Florianópolis");
        lista.inserir("Porto Alegre");
        lista.inserir("Joinville");

        lista.exibir();

        lista.remover("Florianópolis");
        lista.exibir();

        lista.remover("Manaus"); 
    }
}
