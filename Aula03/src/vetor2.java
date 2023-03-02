public class vetor2 {
    public static void main(String[] args) {
        String[] nomes = {"Gustvo", "Ana", "Jakceline", "PREDAO", "JABULANI" };
        String[] inverso = new String[nomes.length];
        int j = 0;
        for (int r = 0; r < nomes.length; r++) {
            System.out.println(nomes[r]);
        }
        for (int i = nomes.length - 1 ; i >= 0; i--) {
            inverso[j] = nomes[i];
            j++;
        }
        for (int l = 0; l < inverso.length; l++) {
            System.out.println(inverso[l]);
        }
    }
}
