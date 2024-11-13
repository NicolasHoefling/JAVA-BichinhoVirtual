package nicolashoefling.bichinhovirtual;

import java.util.Scanner;

public class BichinhoVirtual {

    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean estado = true;
    private int caloria = 10;
    private int forca = 10;

    //comer
    public void comer() {
        if (estado && caloria < 100){
            caloria += 10;
            forca -= 2;
        }
    }

    //correr
    public void correr(){
        if (estado && caloria > 0) {
            caloria -=5;
            forca -= 5;
        }
    }

    //dormir
    public void dormir(){
        if (estado){
            caloria -= 2;
            forca += 10;
        }
    }

    //morrer
    public void morrer(){
        forca = 0;
        estado = false;
    }

    //inicializar o bichinho
    public BichinhoVirtual(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        //this.idade = 0;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Inicializando o bichinho
        System.out.println("Coloque um nome em seu bichinho:");
        String nome = scanner.nextLine();
        System.out.println("Escolha uma classe para o seu bichinho:");
        String classe = scanner.nextLine();
        System.out.println("Escolha uma família para o seu bichinho:");
        String familia = scanner.nextLine();
        System.out.println("\nO animal se chama " + nome + " é da Classe " + classe + " da Família " + familia + ".");
        System.out.println("\nO "+ nome +" possui Força 10, Caloria de 10 e tem 0 Anos");

        //nascer
        BichinhoVirtual bichinho = new BichinhoVirtual(nome, classe, familia);

        // Loop principal
        while (bichinho.estado) {
            System.out.println("\n---------------------------------------");
            System.out.println("O que o "+ bichinho.nome +" vai fazer agora?");
            System.out.println("1 - Comer");
            System.out.println("2 - Correr");
            System.out.println("3 - Dormir");
            System.out.println("4 - Morrer");
            System.out.println("---------------------------------------");
            System.out.println("Escolha uma ação para o bichinho:");


            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    bichinho.comer();
                    System.out.println("\nO "+ bichinho.nome + " comeu e agora sua força é:"+ bichinho.forca + " e suas calorias valem:" + bichinho.caloria);
                    break;
                case 2:
                    bichinho.correr();
                    System.out.println("\nO "+ bichinho.nome + " está correndo! Agora sua força é:"+ bichinho.forca + " e suas calorias valem:" + bichinho.caloria);
                    break;
                case 3:
                    bichinho.dormir();
                    System.out.println("\nO "+ bichinho.nome + " está dormindo! E aumentou sua força para:"+ bichinho.forca + " e suas calorias diminuíram para:" + bichinho.caloria);
                    break;
                case 4:
                    bichinho.morrer();
                    System.out.println("\nF for respect \nO "+ bichinho.nome + " Não tem vida ´infinita´ e infelizmente Bateu as botas :(" );
                    break;
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
        }

        System.out.println("\nGAME OVER!. " + bichinho.nome + " não está mais entre nós.");
        scanner.close();
    }
}
