public class Pessoa {
    private String nome;
    private String telefone;
    private Data nascimento;

    public Pessoa(String nome, String telefone, Data nascimento){
        this.nome=nome;
        this.telefone=telefone;
        this.nascimento=nascimento;
    }
    
    
    public Pessoa(String nome, Data nascimento){
        this.nome=nome;
        this.nascimento=nascimento;
        this.telefone= "";
    }
    
    
    public String getNome(){
        return nome;
    }
    
    
    public String getTelefone(){
        return telefone;
    }
    
    
    public Data getNascimento(){
        return nascimento;
    }
    
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    
    
    public void setNascimento(Data nascimento){
        this.nascimento=nascimento;
    }
    
    public String toString(){
        String temp;
        temp = "\nNome : " + nome + "Telefone : " + telefone + "Nascimento : " + nascimento ;
        return temp;
    }
}

