public class Pilha {
    int tamanho;
    No topo;

    Pilha(){
        tamanho = 0;
        topo = null;
    }

    boolean estaVazia(){
        return tamanho == 0;
    }

    void empilhar(Object info){
        No no = new No(info);
        if (!estaVazia()){
            no.proximo = topo;
        }

        topo = no;
        tamanho++;
    }

    Object topo(){
        if (estaVazia()){
            return "Vazio";
        }
        return topo.info;
    }

    Object desempilhar(){
        if (estaVazia()){
            return "Vazio";
        }
        Object info = topo.info;
        topo = topo.proximo;
        tamanho--;
        return info;
    }
}
