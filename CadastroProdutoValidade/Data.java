public class Data {

   private int dia;
   private int mes;
   private int ano; 
   private int ano1;
   
      public void setDia(int valor) {
         if (valor>0 && valor<32)
         dia = valor;
         else System.out.println("Valor menor ou igual a 0");
      }
             
      public int getDia() {
         return dia;
      } 
      
      public void setMes(int valor) {
         if (valor>0 && valor<13)
         mes = valor;
         else System.out.println("Valor menor ou igual a 0");
     }
         
      public int getMes() {
         return mes;
      } 
      
      public void setAno(int valor) {
         if (valor>2020)
         ano = valor;
         else System.out.println("Valor menor ou igual a 0");
      }
         
      public int getAno() {
         return ano;
      } 
      
      public Data(int dia, int mes, int ano) {
         this.dia = dia;
         this.mes = mes;
         this.ano = ano;
      }
      
      
      public Data(int dia, int mes) {
         this.dia = dia;
         this.mes = mes;
         this.ano = 2021;
      }
      
      public String toString() {
         String temp;
         temp = dia + "/" + mes + "/" + ano;
         return temp;
         
      }
}

      