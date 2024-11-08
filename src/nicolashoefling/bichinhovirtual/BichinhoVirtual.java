package nicolashoefling.bichinhovirtual;

import java.util.Scanner;

public class BichinhoVirtual {

    private string nome;
    private string classe;
    private string familia;
    private int idade;
    private boolean estado = true;
    private int caloria;
    private int forca;


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

        BichinhoVirtual bichinho = new BichinhoVirtual(nome, classe, familia);
    }
}

