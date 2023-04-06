import javax.swing.*;

public class Principal {
    static int op = 0;
    static Fila fila = new Fila();
    public static void main(String[] args) {
        do{
            op = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a opção" +
                            "\n 1 - Enfileirar" +
                            "\n 2 - Inicio" +
                            "\n 3 - Desenfileirar" +
                            "\n 4 - Listar Itens" +
                            "\n 0 - Sair")
            );
            switch (op){
                case 1:
                    String tarefa = JOptionPane.showInputDialog("Digite a tarefa");
                    fila.enfilerar(tarefa);
                    break;
                case 2:
                    String tarefaInicio = (String) fila.inicio();
                    JOptionPane.showMessageDialog(null, tarefaInicio);
                    break;
                case 3:
                    String tare = (String) fila.desenfilerar();
                    JOptionPane.showMessageDialog(null, tare + " Removido");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, fila.listarItens());
                default:
                    break;
            }
        }while (op != 0);
    }
}
