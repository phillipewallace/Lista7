
public class NomeInvertido {
    private String Nome;
    


public void MudarNome(String NovoNome){

    Nome = NovoNome;

}
public String MostrarNome(){

    return Nome;
}

public String inverterNome() {
    StringBuilder nomeInvertido = new StringBuilder();
    for (int i = Nome.length() - 1; i >= 0; i--) {
        char c = Nome.charAt(i);
        nomeInvertido.append(Character.toUpperCase(c));
    }
    return nomeInvertido.toString();

}


}