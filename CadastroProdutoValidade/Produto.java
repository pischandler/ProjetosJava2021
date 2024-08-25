public class Produto {
   
   private String nome;
   private double preco;
   private int quantidade;
   private Data validade;
   
   public void setNome(String nome) {
      nome = nome;
   }
  
   public void setPreco(double valor) {
      if (valor>0)
         preco = valor;
      else System.out.println(" Valor negativo ou zero.");
   }
   
      
   public Produto(String nome,int quantidade,double preco, Data validade) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
      this.validade = validade;
   }
   
   public Produto(String nome, double preco, Data validade) {
      this.nome = nome;
      this.preco = preco;
      this.validade = validade;
   }
   
   public Produto(String nome, Data validade) {
      this.nome = nome;
      this.validade = validade;
   }
   
   public void setValidade(int dia, int mes, int ano) {
      validade = new Data(dia,mes,ano);
   }
   
   public void setValidade(Data validade) {
      this.validade = validade;
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
      temp = "Nome: " + nome + "\nQuantidade: " + quantidade + "\nPreco: " + preco + "\nData de validade: " + validade;
      return temp;
   }   
}
