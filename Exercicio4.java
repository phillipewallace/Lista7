import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        NumeroExtenso numero = new NumeroExtenso();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique um valor entre 1 e 99");
        numero.setNumero(scanner.nextInt());
        System.out.println(numero.obterNumeroExtenso(numero.getNumero()));

        scanner.close();
    }

}
