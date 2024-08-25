public class Principal {

   public static void main(String args[]) {
      ContaCorrente conta, conta1, conta2;
      
      conta = new ContaCorrente();
      conta1 = new ContaCorrente();
      conta2 = new ContaCorrente();
      
      conta.nome="Felipe Schandler Silva";
      conta1.nome="Debora Schandler";
      conta.setAgencia((short)10);
      conta1.setAgencia((short)10);
      conta.setNumero(10);
      conta1.setNumero(11);
      conta.setSaldo(1);
      conta1.setSaldo(1);
      conta.depositar(1000);
      conta1.depositar(1000000);
      conta.imprimir();
      conta1.imprimir();
      conta2.nome="Fabiano Florencio";
      conta2.setAgencia((short)10);
      conta2.setNumero(12);
      conta2.setSaldo(1);
      conta2.depositar(10);
      conta2.depositar(7.23);
      conta2.imprimir();
      }
 }