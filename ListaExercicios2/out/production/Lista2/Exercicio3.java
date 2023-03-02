package ListaExercicios2.out.production.Lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int i = 0, numero = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero para ver sua tabuada");
        numero = in.nextInt();
        while (i <= 10){
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}
