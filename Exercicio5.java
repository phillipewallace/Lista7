import java.util.Scanner;

class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número de telefone");
        ValidaTelefone telefoneInformado = new ValidaTelefone(scanner.next());
        System.out.println("Valida e corrige número de telefone");
        System.out.printf("Telefone: %s \n", telefoneInformado.getTelefone());
        System.out.printf("Telefone possui %d dígitos \n", telefoneInformado.obterDigitos());
        if (telefoneInformado.obterDigitos() == 8) {
            System.out.println("Vou acrescentar o digito nove na frente.");
            telefoneInformado.prefixarDigito(9);
            System.out.printf("Telefone corrigido sem formatação: %s \n", telefoneInformado.formatarTelefone(true));
            System.out.printf("Telefone corrigido com formatação: %s \n", telefoneInformado.formatarTelefone(false));

        }
        scanner.close();
    }
}