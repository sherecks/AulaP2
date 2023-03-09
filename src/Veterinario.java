public class Veterinario {

    private String nome;
    private float salario;
    private String endereco;
    private Animal [] animal = new Animal[50];
    private int QtdAnimais;
    
    //1°
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setAnimal(Animal pet,  int QtdAnimais){
        this.animal[QtdAnimais] = pet;
    }

    public void setQtdAnimais(int QtdAnimais){
        this.QtdAnimais += QtdAnimais;
    }

    //2°
    public String getNome(){
        return this.nome;
    }
    public float getSalario(){
        return this.salario;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public Animal[] getAnimais(){
        return this.animal;
    }
    public int getQtdAnimais(){
        return this.QtdAnimais;
    }
  
}
