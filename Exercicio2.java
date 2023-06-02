import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NomeInvertido NomeI = new NomeInvertido();

        System.out.println("Indique seu nome, aceitamos letras maisculas e minusculas: ");
        NomeI.MudarNome(scanner.nextLine().toUpperCase());

        System.out.println("O seu Nome ao contrario e: " + NomeI.inverterNome().toUpperCase());
        scanner.close();
    }
}