public class ComparacaoDeString {
    private String palavra1;
    private String palavra2;

    public void TrocarPalavra1(String Novapalavra1) {
        palavra1 = Novapalavra1;
    }

    public String MostrarPalavra1() {
        return palavra1;
    }

    public void TrocarPalavra2(String novaPalavra2) {
        palavra2 = novaPalavra2;
    }

    public String MostrarPalavra2() {
        return palavra2;
    }

    public void Mostrardiferença() {
        if (palavra1.length() == palavra2.length()) {
            System.out.println("As strings possuem o mesmo comprimento.");

            if (palavra1.equalsIgnoreCase(palavra2)) {
                System.out.println("As strings são iguais.");
            } else {
                System.out.println("As strings são diferentes.");
            }
        } else {
            System.out.println("As strings possuem comprimentos diferentes.");
        }
    }

}
