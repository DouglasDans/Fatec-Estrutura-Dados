public class Lista {
    No inicio;
    No fim;
    int tamanho;

    Lista(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    void add(String nome, String tel){
        No no = new No(nome, tel);
        if(estaVazia()){
            inicio = no;
        }else{
            fim.proximo = no;
        }
        fim = no;
        tamanho++;
    }

    boolean estaVazia(){
        return tamanho == 0;
    }

    void imprimir(){
        No no = inicio;
        for(int i = 0; i < tamanho; i++){
            System.out.print(no.nome + ": ");
            System.out.println(no.tel);
            no = no.proximo;
        }
    }

    Object retornarDados(int indice){
        No no = inicio;
        for(int i = 1; i < indice; i++){
            no = no.proximo;
        }
        return no.nome + ": " + no.tel;
    }

    Object buscaTelefone(String nome){
        No no = inicio;
        for(int i = 0; i < tamanho; i++){
            if (no.nome.equals(nome)){
                return no.tel;
            }
            no = no.proximo;
        }
        return "Não localizado";
    }
}
