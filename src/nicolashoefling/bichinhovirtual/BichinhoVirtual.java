package nicolashoefling.bichinhovirtual;

import java.util.Scanner;

public class BichinhoVirtual {

    private string nome;
    private string classe;
    private string familia;
    private int idade;
    private boolean estado = true;
    private int caloria = 0;
    private int forca = 10;

    //comer
    public void comer() {
        if (estado && caloria < 100){ //caso o bicho ainda esteja vivo e com fome
            caloria += 10;
            forca -= 2;
            // msg
        }
    }

    //correr
    public void correr(){
        if (estado && caloria > 0) {
            caloria -=5;
            forca -= 5;
            //msg
        }
    }

    //dormir
    public void dormir(){
        if (estado){
            caloria -= 2;
            forca += 10;
            //msg
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

        //nascer
        BichinhoVirtual bichinho = new BichinhoVirtual(nome, classe, familia);

        // Loop principal
        //while (bichinho.estado) {
        //  System.out.println("\nEscolha uma ação para o bichinho:");
        //  System.out.println("1 - Comer");
        //  System.out.println("2 - Correr");
        //  System.out.println("3 - Dormir");
        //  System.out.println("4 - Morrer");
    }
}
