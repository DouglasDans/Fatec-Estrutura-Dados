import java.util.Scanner;

public class FibonacciRecursivo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidde de valores");
        System.out.println(fibo(0,1,in.nextInt()));
        for (int i = 0; i < 7; i++){
            System.out.println(fiboJack(i));
        }
    }

    static int fibo (int valor, int anterior, int qntdValores){
        if (qntdValores == 0){
            return valor;
        }
        qntdValores --;
        System.out.println(valor + anterior);
        return fibo((valor + anterior), valor, qntdValores);
    }

    public static int fiboJack (int n){
        if (n < 2){
            return 1;
        }
        return fiboJack(n - 1) + fiboJack(n - 2);
    }
}