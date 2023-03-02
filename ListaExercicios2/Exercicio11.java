package ListaExercicios2;

public class Exercicio11 {
    public static void main(String[] args) {
        int numAtual = 1, anterior = 0, resultado = 1;
        while(numAtual < 1000){
            System.out.println(resultado);
            resultado = anterior + numAtual;
            anterior = numAtual;
            numAtual = resultado;
        }
    }
}
