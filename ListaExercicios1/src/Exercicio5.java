import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor1 = in.nextInt();
        int  valor2 = in.nextInt();
        if (valor1 > valor2){
            System.out.println(valor1 + " é maior que " + valor2);
        }
        if (valor1 < valor2){
            System.out.println(valor1 + " é menor que " + valor2);
        }
        if (valor1 == valor2){
            System.out.println(valor1 + ": Valores iguais");
        }
    }
}
