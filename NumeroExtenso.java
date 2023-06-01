public class NumeroExtenso {
private int numero;


public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
    if (numero < 0 || numero > 99) {
        System.out.println("Número inválido.");
        return;
    }
}

public String obterNumeroExtenso(int numero) {
    String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
            "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
    String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

    if (numero <= 19) {
        return unidades[numero];
    } else {
        int unidade = numero % 10;
        int dezena = numero / 10;
        String extensoDezena = dezenas[dezena];
        String extensoUnidade = unidades[unidade];
        if (extensoUnidade.equals("zero")) {
            return extensoDezena;
        } else {
            return extensoDezena + " e " + extensoUnidade;
        }
    }
}
}












    

