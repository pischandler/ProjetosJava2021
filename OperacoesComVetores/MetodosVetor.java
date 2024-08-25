import java.util.Arrays;

public class MetodosVetor {

   public static void soma(int vetor[]) {
   
      int soma = vetor[0];
      for (int i=1; i < vetor.length; i++)
         soma = soma + vetor[i];
         
         System.out.println("A soma eh:" + soma);
      }
      
   public static void media(int vetor[]) {
   
      int soma = vetor[0];
      for (int i=1; i < vetor.length; i++)
         soma = soma + vetor[i];
       double media = soma / vetor.length;
        
        System.out.println("A media eh:" + media);
      }
   public static void buscaBinaria(int vetor[], int chave) {
      Arrays.sort(vetor);
      int posicao = Arrays.binarySearch(vetor,chave);
      if (posicao>=0)
         System.out.println("Elemento encontrado na posicao: " + posicao);
         else System.out.println("Elemento nao encontrado.");
      }
      public static void imprimir(int vetor[]) {
      for ( int i = 0 ; i < vetor.length ; i++ ) {
            System.out.println(vetor[i]);
         }
   }

   public static void ordenar(int vetor[]) {
      for ( int i = 0 ; i < vetor.length ; i++ ) {
        }
        Arrays.sort(vetor);
        for ( int i = 0 ; i < vetor.length ; i++ ) {
            System.out.println(vetor[i]);
         }
   }
   
}   
      
   