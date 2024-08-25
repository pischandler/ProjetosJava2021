public class ContaCorrente {
   
   private String nome;
   private int numero;
   private short agencia;
   private double saldo;
   private double limite;
   
   public ContaCorrente(String nome, int numero, short agencia, double saldo, double limite) {
      this.nome=nome;
      this.numero=numero;
      this.saldo=saldo;
      this.agencia=agencia;
      this.limite=limite;
    }
    
     public ContaCorrente(String nome, int numero, short agencia, double saldo) {
      this.nome=nome;
      this.numero=numero;
      this.saldo=saldo;
      this.agencia=agencia;
    }

   public void atualizar(double saldo, double limite) {
      if (saldo>=0)
      this.saldo = saldo;
      if (limite>=0)
      this.limite = limite;
    }
    
     public void atualizar(String nome, int numero, short agencia) {
      this.nome = nome;
      if (numero>0)
      this.numero=numero;
      if (agencia>0)
      this.agencia=agencia;
    }

   
   public void setNumero(int valor) {
      if (valor>0)
         numero = valor;
      else System.out.println(" Valor negativo ou zero.");
    }
    
    public int getNumero() {
      return numero;
    }
    
    public void setAgencia(short valor) {
      if (valor>0)
         agencia = valor;
      else System.out.println("Valor negativo ou zero.");
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
      else System.out.println ("Valor negativo ou zero.");
    }
    
    public void setLimite(double valor) {
      if (valor>0)
         limite = valor;
      else System.out.println ("Valor negativo.");
     }
     
     public double getLimite() {
         return limite;
     }
     
    
    public void imprimir() {
      System.out.println ("Nome: "+nome);
      System.out.println ("Numero: "+numero);
      System.out.println ("Agencia: "+agencia);
      System.out.println ("Saldo: "+saldo);
      System.out.println ("Limite: "+limite); 
     }
}

