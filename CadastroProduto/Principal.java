public class Principal {
   
   public static void main(String args[]) {
   
      Produto vetor[] = new Produto[3];
      
      vetor[0] = new Produto("Arroz", 1000, 20);
      vetor[1] = new Produto("Oleo de soja", 2000, 25);
      vetor[2] = new Produto("Sabao em po", 8000, 30);
      
      System.out.println(vetor[0]);
      System.out.println(vetor[1]);
      System.out.println(vetor[2]); 
    }
}