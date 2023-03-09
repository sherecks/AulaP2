public class Dono {

    private String nome;
    private String endereco;
    private String cpf;

    //1°
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    //2°
    public String getNome(){
        return this.nome;  

    }
    public String getEndereco(){
        return this.endereco;  
    }
    public String getCpf(){
        return this.cpf;    
    }
    
}
