import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double soma = 0.0;
        for (int i = 0; i < 3; i++){
            soma += in.nextDouble();
        }
        System.out.println("A soma dos numeros é: " + soma);
    }
}