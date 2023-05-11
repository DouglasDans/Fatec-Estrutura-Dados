package Aula07.src;

public class Sort {
    public static void main(String[] args) {
        int vetor [] = {7, 9, 5, 6 , 7, 2};
//        selectionSort(vetor);
        bubbleSort(vetor);
    }

    private static void selectionSort(int[] vetor){

        for (int i = 0; i < vetor.length; i++) {
            int menor = Integer.MAX_VALUE;
            int indiceMenor = i;
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = menor;
            vetor[indiceMenor] = temp;
            System.out.println(vetor[i]);
        }
    }
    
    private static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean varifica = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                varifica = true;
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
