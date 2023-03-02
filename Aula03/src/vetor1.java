public class vetor1 {
    public static void main(String[] args) {
        Double[] vetor = {1200.0, 10000.0, 1040.0, 2500.0};

        for (int i = 0; i < vetor.length; i++){
            vetor[i] += 200;
        }
        for (int j = 0; j < vetor.length; j++){
            System.out.println("Salario novo: " + vetor[j]);
        }
    }
}
