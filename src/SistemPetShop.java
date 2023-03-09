import java.util.Scanner;

public class SistemPetShop {

    //1°
    private static int QtdVet = 0;
    private static Veterinario  [] veterinarios = new Veterinario[50];

    static Scanner s = new Scanner(System.in);

    private SistemPetShop(){

    }


    //Cadastro Veterinario!!!
    public static void cadastroVet(){

        Veterinario Vet1 = new Veterinario();
            
        System.out.println("Nome do veterinario: ");
            Vet1.setNome(s.nextLine());
        System.out.println("Salario do veterinario: ");
            Vet1.setSalario(Integer.valueOf(s.nextLine()));
            Vet1.setQtdAnimais(0);


        veterinarios[QtdVet] = Vet1;
        QtdVet++;
        
    }

    //Print Veterinarios!!!
    public static void printVeterinario(){
        
        for(int i = 0 ; i < QtdVet ; i++){
            
            System.out.print("\n");
            System.out.println("°°°°°°°Veterinaria(o)" + (i+1) + "°°°°°°°");
            System.out.println("Nome: " + veterinarios[i].getNome());
            System.out.println("Salario: " + veterinarios[i].getSalario());
            System.out.println("Quantidade de animais: " + veterinarios[i].getQtdAnimais());
            System.out.println("\n");
        
        }
    }


    //Cadastro Animal!!!
    public static void cadastroAnimal(int n_vet){

        Animal pet = new Animal();

        System.out.println("Nome do animal: ");
            pet.setNome(s.nextLine());
        System.out.println("Eespecie: ");
            pet.setEspecie(s.nextLine());
        System.out.println("Descrição sobre o animal: ");
            pet.setDescricao(s.nextLine());

        int n_animais = veterinarios[n_vet - 1].getQtdAnimais();

        veterinarios[n_vet - 1].setAnimal(pet, n_animais);
        veterinarios[n_vet - 1].setQtdAnimais(1);

    }

    //Print Animal!!!
    public static void printAnimal(int n_vet){

        if(veterinarios[n_vet-1].getQtdAnimais() != 0){

            System.out.println("°°°°°°°Animais°°°°°°°");

            for(int j = 0 ; j < veterinarios[n_vet - 1].getQtdAnimais() ; j++){
                System.out.println("Animal " + (j+1) +":\n");
                System.out.println("Nome: " + veterinarios[n_vet - 1].getAnimais()[j].getNome());

                if(veterinarios[n_vet - 1].getAnimais()[j].getDono() != null){
                    System.out.println("Dono: " + veterinarios[n_vet - 1].getAnimais()[j].getDono().getNome());
                    System.out.println("CPF: " + veterinarios[n_vet - 1].getAnimais()[j].getDono().getCpf());
                }

                System.out.println("Especie: " + veterinarios[n_vet - 1].getAnimais()[j].getEspecie());
                System.out.println("Descricao: " + veterinarios[n_vet - 1].getAnimais()[j].getDescricao());
                System.out.print("\n");
            }

        }

    }

    //Cadastro Dono!!!
    public static void cadastrarDono(int n_vet, int n_animal){

        Dono dono = new Dono();
        System.out.println("Digite o nome do dono: ");
            dono.setNome(s.nextLine());
        System.out.println("CPF: ");
            dono.setCpf(s.nextLine());

        veterinarios[n_vet - 1].getAnimais()[n_animal - 1].setDono(dono);

    }

    //Print Donos!!!
    public static void cadastroEndDono(int n_vet, int n_animal){

        Endereco dono = new Endereco();

        System.out.println("Sua rua: ");
            dono.setRua(s.nextLine());
        System.out.println("Numero da casa/predio: ");
            dono.setNumero(Integer.valueOf(s.nextLine()));
        System.out.println("Bairro: ");
            dono.setBairro(s.nextLine());
        System.out.println("Cidade: ");
            dono.setCidade(s.nextLine());
        System.out.println("UF: ");
            dono.setEstado(s.nextLine());
        System.out.println("CEP: ");
            dono.setCep(s.nextLine());

        veterinarios[n_vet - 1].getAnimais()[n_animal - 1].getDono().setEndereco(dono);

    }


    //MAIN!!!
    public static void main(String[] args) {
        
        int escolha = 0;
        int n_vet = 0;
        int n_animal = 0;

        do{

            System.out.println("°°°°°°°°MENU°°°°°°°°");
            System.out.println("1° Cadastrar Veterinario");
            System.out.println("2° Mostrar Veterinarios");
            System.out.println("3° Cadastrar Animal");
            System.out.println("4° Mostrar Animais");
            System.out.println("5° Cadastrar Dono Animal");
            System.out.println("6° Cadastrar Endereço Dono Animal");
            System.out.println("7° Sair do programa");

            System.out.println("Escolha uma opção do menu: ");
            escolha = Integer.valueOf(s.nextLine());

            switch(escolha){

                //Cadastro!!!
                case 1:
                cadastroVet();
                break;

                //Printar!!!
                case 2:
                printVeterinario();
                break;

                //Cadastro!!!
                case 3:
                printVeterinario();

                System.out.println("Digite o numero do veterinario que \nvoce quer cadastrar um animal: ");
                    n_vet = Integer.valueOf(s.nextLine());

                cadastroAnimal(n_vet);
                break;

                //Printar!!!
                case 4:
                printVeterinario();

                System.out.println("Digite o numero do veterinario que \nvoce quer ver os animais atendidos: ");
                    n_vet = Integer.valueOf(s.nextLine());

                printAnimal(n_vet);
                break;

                //Cadastro!!!
                case 5:
                printVeterinario();

                System.out.println("Digite o numero do veterinario que \nvoce quer ver os animais atendidos: ");
                    n_vet = Integer.valueOf(s.nextLine());

                printAnimal(n_vet);

                System.out.println("Digite o numero do animal que\ndeseja cadastrar um dono: ");
                    n_animal = Integer.valueOf(s.nextLine());

                cadastrarDono(n_vet, n_animal);
                break;

                //Cadastro!!!
                case 6:
                printVeterinario();

                System.out.println("Digite o numero do veterinario que \nvoce quer ver os animais atendidos: ");
                    n_vet = Integer.valueOf(s.nextLine());

                printAnimal(n_vet);

                System.out.println("Digite o numero do animal que\ndeseja cadastrar o endereço do dono: ");
                    n_animal = Integer.valueOf(s.nextLine());

                cadastroEndDono(n_vet, n_animal);
                break;

            }
        }while (escolha != 7);

    }

}
