public class Principal {

   public static void main(String args[]) {
      ContaCorrente conta, conta1, conta2;
      
      conta=new ContaCorrente("Felipe Schandler",10,(short)31,1000,100);
      conta1=new ContaCorrente("Debora Schandler",11,(short)32,1000000,100000);
      conta2=new ContaCorrente("Fabiano Florencio",12,(short)33,15);
      conta.atualizar(1002,102);
      conta2.atualizar("Fabiano Silva", 13, (short)32);
      conta1.depositar(100);
      conta2.sacar(2);
      conta.imprimir();
      conta1.imprimir();
      conta2.imprimir();
      }
 }