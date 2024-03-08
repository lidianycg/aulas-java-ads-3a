import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int Valores [ ], i, media, soma = 0;
        Valores = new int [50];
        
        for (i=0; i<=49; i++) {
            Valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma = soma + Valores[i];
        }
        
        media = soma/50;
        
       System.out.println ("A média dos valores digitados é: " + media);
       System.exit(0);
        
    }
    
}
