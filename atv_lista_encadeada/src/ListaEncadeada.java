
public class ListaEncadeada {
    private No inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void inserir(String cidade) {
        No novo = new No(cidade);
        if (inicio == null) {
            inicio = novo;
        } else {
            No temp = inicio;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novo;
        }
        System.out.println("Cidade \"" + cidade + "\" inserida!");
    }

    public void remover(String cidade) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (inicio.cidade.equals(cidade)) {
            inicio = inicio.proximo;
            System.out.println("Cidade \"" + cidade + "\" removida!");
            return;
        }

        No temp = inicio;
        while (temp.proximo != null && !temp.proximo.cidade.equals(cidade)) {
            temp = temp.proximo;
        }

        if (temp.proximo == null) {
            System.out.println("Cidade \"" + cidade + "\" não encontrada!");
        } else {
            temp.proximo = temp.proximo.proximo;
            System.out.println("Cidade \"" + cidade + "\" removida!");
        }
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia!");  
            return;
        }

        No temp = inicio;
        System.out.println("Cidades na lista:");
        while (temp != null) {
            System.out.println("- " + temp.cidade);
            temp = temp.proximo;
        }
    }
}

