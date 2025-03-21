import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        int num;
        ArvoreBinaria arv = new ArvoreBinaria();

        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            arv.inserirNo(num);
        }

        arv.exibirNo();
        System.exit(0);
    }
}
