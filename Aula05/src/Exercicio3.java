import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(mult(in.nextFloat(), in.nextFloat()));
    }

    static double mult(double v1, double v2){
        if(v1 == 1){
            return v2;
        }else {
            v1--;
            return v2 += mult(v1,v2);
        }


    }
}
