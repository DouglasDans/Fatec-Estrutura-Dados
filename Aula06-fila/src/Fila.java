public class Fila {
    No inicio;
    No fim;
    int tamanho;

    Fila() {
        this.tamanho = 0;
        this.inicio = null;
        this.fim = null;
    }

    boolean estaVazia() {
        return tamanho == 0;
    }

    void enfilerar(Object info) {
        No no = new No(info);
        if (estaVazia()) {
            this.inicio = no;
        } else {
            this.fim.proximo = no;
        }
        this.fim = no;
        tamanho++;
    }

    Object desenfilerar() {
        if (estaVazia()) {
            return null;
        }
        Object info = this.inicio.info;
        this.inicio = this.inicio.proximo;
        tamanho--;
        return info;
    }

    Object inicio(){
        if (estaVazia()){
            return null;
        }
        return inicio.info;
    }

    String listarItens(){
        String valores = "";
        No no = this.inicio;
        for (int i = 0; i < tamanho; i++) {
            valores += no.info + "\n";
            no = no.proximo;
        }
        return valores;
    }
}
