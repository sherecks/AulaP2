public class Animal {

    private String nome;
    private String dono;
    private String especie;
    private String descricao;

    //1°
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    //2°
    public String getNome(){
        return this.nome;
    }
    public String getDono(){
        return this.dono;
    }
    public String getEspecie(){
        return this.especie;
    }
    public String getDescricao(){
        return this.descricao;
    }

}
