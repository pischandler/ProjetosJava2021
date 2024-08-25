public class Principal {
   
   public static void main(String args[]) {
   
      Produto vetor[] = new Produto[4];
      
      Data d1 = new Data(12,12,2021);
      Data d2 = new Data(12,10);
      
      vetor[0] = new Produto("Arroz",1000,50,d1);
      vetor[1] = new Produto("Frango",2000,30,d2);
      
      System.out.println(vetor[0]);
      System.out.println(vetor[1]);
      }
}            