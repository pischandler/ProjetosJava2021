public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome,String telefone,Data nascimento, String ra){
        super(nome,telefone,nascimento);
        this.ra=ra;
    }
    public Aluno(String nome,Data nascimento, String ra){
        super(nome,nascimento);
        this.ra=ra;
    }

    public void setRa(String ra){
        this.ra = ra;
    }
    
    
    public String getRa(){
        return ra;
    }
    

    public String toString(){
        String temp; 
            temp = "\nNome : " + getNome() + "\nTelefone : " + getTelefone() + "\nNascimento : " + getNascimento() + "\nRa : " + getRa();
        return temp;
    }
}
