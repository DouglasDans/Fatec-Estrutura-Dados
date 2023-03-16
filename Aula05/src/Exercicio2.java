import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(mult(in.nextFloat(), in.nextFloat()));
    }

    static double mult(double v1, double v2){
        double result = 0;
        for (int i = 1; i <= v1; i++) {
            result += v2;
        }
        return result;
    }
}
