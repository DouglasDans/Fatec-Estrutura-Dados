import java.io.*;

public class samba {
    public static void main (String [] Args) throws  IOException {
//        lerArquivo("C:\\Users\\FATEC ZONA LESTE\\Desktop\\samba.txt");
//        gravarArquivo("C:\\Users\\FATEC ZONA LESTE\\Desktop\\new.txt");

        convertSubstring();
        convertSplit();
    }

    private static void lerArquivo(final String ARQ_ENT) throws IOException{
        FileReader fr = new FileReader(ARQ_ENT);
        BufferedReader br = new BufferedReader(fr);

        String linha = br.readLine();

        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
    }

    private static void gravarArquivo(final String ARQ_SAIDA)  throws IOException {
        FileWriter fw = new FileWriter(ARQ_SAIDA);
        BufferedWriter bw = new BufferedWriter(fw);

        String linha = "primeira linha";
        bw.write(linha); bw.newLine();

        for (int i = 0; i < 1000; i++) {
            bw.write("dfgfdiughfdg" + i);
            bw.newLine();
        }

        bw.flush();
    }

    private static void convertSubstring() throws IOException{
        String dataAM = "2022/08/10";

        String ano = dataAM.substring(0, 4);
        String mes = dataAM.substring(5, 7);
        String dia = dataAM.substring(8, 10);

        System.out.println(dia + "/" + mes + "/" + ano);
    }

    private static void convertSplit() throws IOException{
        String dataAM = "2022/08/10";

        String data[] = dataAM.split("/");
        System.out.println(data[2] + "/" + data[1] + "/" + data[0]);
    }
}
