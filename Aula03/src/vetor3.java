import java.util.Scanner;

public class vetor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas");
        int qntdNotas = in.nextInt();
        double[] notas = new double[qntdNotas];
        double media = 0.0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota");
            notas[i] = in.nextDouble();
            media += notas[i];
        }
        media = media / notas.length;
        System.out.println("Media é: " + media);
        System.out.printf("As notas acima da média são:  %.2f", media);
        for (int m = 0; m < notas.length; m++) {
            if (notas[m] > media){
                System.out.println(media);
            }
        }

    }
}
