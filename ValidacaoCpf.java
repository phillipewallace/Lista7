public class ValidacaoCpf {
    private string CPF;

public string getCPF() {
    return CPF;
    }


public void setCPF(string cPF) {
    CPF = cPF;
    
    if (validarCPF(CPF)) {
        System.out.println("CPF válido.");
    } else {
        System.out.println("CPF inválido.");
    }

}
public static boolean validarCPF(String cpf) {
    cpf = cpf.replaceAll("[^0-9]", "");

    if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
        return false;
    }

    int[] digitos = new int[11];
    for (int i = 0; i < 11; i++) {
        digitos[i] = cpf.charAt(i) - '0';
    }

    int soma = 0;
    for (int i = 0; i < 9; i++) {
        soma += digitos[i] * (10 - i);
    }

    int digito1 = 11 - (soma % 11);
    if (digito1 > 9) {
        digito1 = 0;
    }

    if (digito1 != digitos[9]) {
        return false;
    }

    soma = 0;
    for (int i = 0; i < 10; i++) {
        soma += digitos[i] * (11 - i);
    }

    int digito2 = 11 - (soma % 11);
    if (digito2 > 9) {
        digito2 = 0;
    }

    return digito2 == digitos[10];
}








}
