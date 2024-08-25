public class Produto {
   
   private String nome;
   private double preco;
   private int quantidade;
   
   public void setNome(String nome) {
      nome = nome;
   }
  
   public void setPreco(double valor) {
      if (valor>0)
         preco = valor;
      else System.out.println(" Valor negativo ou zero.");
   }
   
      
   public Produto(String nome,int quantidade,double preco) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
   }
   
   public Produto(String nome, double preco) {
      this.nome = nome;
      this.preco = preco;
   }
   
   public void vender(int qtde) {
      if (qtde <= quantidade)
         quantidade = quantidade - qtde;
      else System.out.println("Quantidade em estoque insuficiente.");
   }
   
   public void comprar(int qtde) {
      if (qtde > 0)
         quantidade = quantidade + qtde;
      else System.out.println("Quantidade de compra invalida: valor negativo ou nulo.");
   }
   
    public void setQuantidade(int valor) {
      if (valor>=0)
         quantidade = valor;
      else System.out.println(" Valor negativo.");
   }

   
   public String toString() {
      String temp;
      temp = "Nome: " + nome + "\nQuantidade: " + quantidade + "\nPreco: " + preco;
      return temp;
   }   
}

   

   
   