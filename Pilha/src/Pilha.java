import javax.swing.*;

public class Pilha {
    int tamanho;
    int topo;
    int vetor [];
    
    Pilha (int tam) {
        topo = -1;
        tamanho = tam;
        vetor = new int [tam];
    }
    
    public boolean PilhaVazia () {
        if (topo == -1) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
   public boolean PilhaCheia () {
       if (topo >= tamanho-1) 
       {
           return true;
       }
       else 
       {
           return false;
       }
   }
   
   public void Empilhar (int elemento) {
       if (! PilhaCheia( )) 
       {
           topo = topo + 1;
           vetor[topo] = elemento;
       }
       else 
       {
           System.out.println("Pilha Cheia");
       }
   }
   
   public int Desempilhar () {
       int desempilhado = 0;
       if (PilhaVazia())
       {
           System.out.println("Pilha Vazia");
       }
       else
       {
           desempilhado = vetor[topo];
           topo = topo - 1;
       }
       return desempilhado;
   }
   
   public void ElementoTopo () {
       if (topo >= 0)
       {
           System.out.println("O elemento do topo é " + vetor[topo]);
       }
       else
       {
           System.out.println("Pilha Vazia");
       }
   }
   
   public void MostrarPilha () {
       int i;
       for (i = topo ; i >= 0; i--)
       {
           System.out.println("Elemento " + vetor[i] + ", posição " + i + " da Pilha");
       }
   }   
}
