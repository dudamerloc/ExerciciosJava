import java.util.Scanner;

class Produto{
    String nome;
    double preco;
    int quantidade;

    void atributos(){
        System.out.println("O produto é: " + nome);   
        System.out.println("o preço dos produto: " + preco);   
        System.out.println("Quantidade de produtos: " + quantidade);   

    
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        produto.preco = scanner.nextDouble();

        System.out.println("Digite a quantidade de produtos: ");
        produto.quantidade = scanner.nextInt();

        produto.atributos();
        scanner.close();

    }
}
