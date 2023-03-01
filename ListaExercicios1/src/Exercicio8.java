import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = 0;
        idade = in.nextInt();
        if (idade < 16){
            System.out.println("Não pode votar");
        } else if(idade < 17){
            System.out.println("Voto Opcional");
        } else if (idade < 70) {
            System.out.println("Voto obrigatório");
        } else {
            System.out.println("Voto opcional");
        }
    }
}
