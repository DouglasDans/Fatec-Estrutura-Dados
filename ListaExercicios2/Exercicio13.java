package ListaExercicios2;

public class Exercicio13 {
    public static void main(String[] args) {
        int qntdColunas = 10;
        int espaco = qntdColunas;
        int qntdAsterisco = 1;
        for (int i = 0; i < qntdColunas / 2; i++){
            espaco = (qntdColunas - i);
            for (int j = 0; j <= espaco; j++ ){
                System.out.print(" ");
            }
            for (int j = 0; j < qntdAsterisco ; j++ ){
                System.out.print("*");
            }
            qntdAsterisco = qntdAsterisco + 2;
            System.out.println(" ");
        }
        for (int i = qntdColunas; i > 1 ; i--){
            espaco = qntdColunas*2 - i - 4;
            for (int j = espaco; j > 0; j-- ){
                System.out.print(" ");
            }
            for (int j = qntdAsterisco; j > 0 ; j--){
                System.out.print("*");
            }
            qntdAsterisco = qntdAsterisco - 2;
            System.out.println(" ");

        }
    }
}
