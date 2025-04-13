import java.util.Scanner;

class Veiculos{
    String marca;
    int ano;

    void exibirDados(){
    System.out.println("A marca do veículo é: " + marca + ".");
    System.out.println("O ano do veículo: " + ano + ".");
    }
}

class Carro extends Veiculos{
    int portas;

    void abrirPorta(){
        System.out.println("Você abriu as portas: " + portas);
    }
}

class Moto extends Veiculos{
    boolean temPartidaEletrica;

    void exibirPartidaEletrica() {
        if (temPartidaEletrica) {
            System.out.println("A moto tem partida elétrica.");
        } else {
            System.out.println("A moto não tem partida elétrica.");
        }
    }
    void empinar(){
        System.out.println("Você empinou a moto!");
    }
}



public class Automoveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();
    
        System.out.println("Digite a marca do carro: ");
        carro.marca = scanner.nextLine();

        System.out.println("Digite o ano do seu carro: ");
        carro.ano = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o número de portas: ");
        carro.portas = scanner.nextInt();

        System.out.println();
        carro.exibirDados();
        carro.abrirPorta();

        System.out.println("\n-------------------------------------------\n");

        Moto moto = new Moto();

        System.out.println("Digite a marca da moto: ");
        moto.marca = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Digite o ano da moto: ");
        moto.ano = scanner.nextInt();

        System.out.println("A moto tem partida elétrica? (true/false)");
        moto.temPartidaEletrica = scanner.nextBoolean();


        System.out.println();
        moto.exibirDados();
        moto.exibirPartidaEletrica();
        moto.empinar();
        
     }
    }
