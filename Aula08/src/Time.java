import java.io.*;

public class Time {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\FATEC ZONA LESTE\\Desktop\\entrada.txt");
        BufferedReader br = new BufferedReader(fr);

        String linha = br.readLine();

        int listaTimes = Integer.parseInt(linha);
        String times[] = new String [listaTimes];

        linha = br.readLine();

        for (int i = 0; i < listaTimes; i++) {
            times[i] = linha;
            System.out.println(times[i]);
            linha = br.readLine();
        }


    }
}

