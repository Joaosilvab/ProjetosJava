
class ListaEncadeada {
    private No cabeca;

    public ListaEncadeada() {
        this.cabeca = null;
    }

    public void inserir(String cidade) {
        No novo = new No(cidade);
        if (cabeca == null) {
            cabeca = novo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        System.out.println("✅ Cidade adicionada: " + cidade);
    }

    public void remover(String cidade) {
        if (cabeca == null) {
            System.out.println("⚠️ A lista está vazia.");
            return;
        }

        if (cabeca.cidade.equals(cidade)) {
            cabeca = cabeca.proximo;
            System.out.println("🗑️ Cidade removida: " + cidade);
            return;
        }

        No atual = cabeca;
        while (atual.proximo != null && !atual.proximo.cidade.equals(cidade)) {
            atual = atual.proximo;
        }

        if (atual.proximo == null) {
            System.out.println("❌ Cidade não encontrada: " + cidade);
        } else {
            atual.proximo = atual.proximo.proximo;
            System.out.println("🗑️ Cidade removida: " + cidade);
        }
    }

    public void exibir() {
        if (cabeca == null) {
            System.out.println("⚠️ Nenhuma cidade cadastrada.");
            return;
        }

        No atual = cabeca;
        System.out.println("\n📍 Lista de cidades:");
        while (atual != null) {
            System.out.println("→ " + atual.cidade);
            atual = atual.proximo;
        }
        System.out.println();
    }
}