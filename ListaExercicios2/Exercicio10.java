package ListaExercicios2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fatorial = 0, resultado = 1, anterior = 1;
        System.out.println("Digite qual número você quer o fatorial.");
        fatorial = in.nextInt();
        for (int i = 1; i <= fatorial; i++){
            resultado = anterior * i;
            anterior = resultado;
            System.out.println(resultado);
        }
    }
}
