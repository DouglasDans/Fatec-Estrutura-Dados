import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double lado1 = in.nextDouble();
        Double lado2 = in.nextDouble();
        Double lado3 = in.nextDouble();
        if (lado1.equals(lado2)){
            if (lado1.equals(lado3)){
                if (lado3.equals(lado2)){
                    System.out.println("O Trângulo é equilatero");
                }
            }
        }else {
            System.out.println("O Triângulo não é equilatero");
        }
    }
}
