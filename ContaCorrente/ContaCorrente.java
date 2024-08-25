public class ContaCorrente {
   
   public String nome;
   private int numero;
   private double saldo;
   private short agencia;
   
   public void setNumero(int valor) {
      if (valor>0)
         numero = valor;
      else System.out.println(" Valor negativo.");
    }
    
    public int getNumero() {
      return numero;
    }
    
    public void setAgencia(short valor) {
      if (valor>0)
         agencia = valor;
      else System.out.println("Valor negativo.");
    }
      
    public short getAgencia() {
       return agencia;
    }
         
    public void depositar(double valor) {
         saldo = saldo + valor;
    }
      
    public void sacar(double valor) {
      if (valor>saldo)
         System.out.println("Saldo insuficiente.");
      else
         saldo = saldo - valor;
    }
    
    public void setSaldo(double valor) {
      if (valor>0)
         saldo = valor;
      else System.out.println ("Valor negativo.");
    }
    
    public void imprimir() {
      System.out.println ("Nome: "+nome);
      System.out.println ("Numero: "+numero);
      System.out.println ("Agencia: "+agencia);
      System.out.println ("Saldo: "+saldo);
     }
}

