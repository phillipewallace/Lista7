import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ValidacaoCpf cpf = new ValidacaoCpf();

        System.out.println("Indique o Cpf, no formato xxx.xxx.xxx-xx: ");
        cpf.setCPF(scanner.nextLine());

        scanner.close();

    }

}
