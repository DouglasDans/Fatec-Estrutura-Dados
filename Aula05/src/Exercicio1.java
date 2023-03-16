import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(mult(in.nextFloat(), in.nextFloat()));
    }

    static double mult(double v1, double v2){
        return v1 * v2;
    }

}
