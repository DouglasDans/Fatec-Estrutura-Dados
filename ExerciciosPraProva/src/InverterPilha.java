public class InverterPilha {
    public static void main(String[] args) {
        Pilha pia = new Pilha();

        pia.empilhar("E");
        pia.empilhar("D");
        pia.empilhar("C");
        pia.empilhar("B");
        pia.empilhar("A");
        System.out.println(pia.topo());

        Pilha pilhaInvertida = new Pilha();

        while(!pia.estaVazia()){
            pilhaInvertida.empilhar(pia.desempilhar());
        }

        System.out.println(pilhaInvertida.desempilhar());

        while (!pilhaInvertida.estaVazia()){
            pia.empilhar(pilhaInvertida.desempilhar());
        }

        System.out.println(pia.topo());
    }
}
