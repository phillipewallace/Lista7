import java.util.Scanner;
import ComparacaoDeString;

public class Atividade1Lista7 {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    ComparacaoDeString comparacao = new ComparacaoDeString();

    System.out.println("Comparação de duas String");

    System.out.println("Digite a Primeira palavra: ");
    comparacao.TrocarPalavra1(scanner.nextLine().toUpperCase());

    System.out.println("Digite a Segunda palavra: ");
    comparacao.TrocarPalavra2(scanner.nextLine().toUpperCase());


    System.out.println("O comprimento da primeira palavra e: " + comparacao.MostrarPalavra1().length());
    System.out.println("O comprimento da segunda palavra e: " + comparacao.MostrarPalavra2().length());

    comparacao.Mostrardiferença();

    scanner.close();

    }
}
