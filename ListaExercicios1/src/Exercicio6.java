import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = 0;
        int contador = 0;
        for(int i = 0; i < 3; i++){
            valor = in.nextInt();
            if(valor < 0){
                contador++;
            }
        }
        System.out.println(contador + " dos 3 valores são negativos");
    }
}
