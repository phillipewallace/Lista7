class ValidaTelefone {
    private String telefone;

    public ValidaTelefone(String telefone) {
        this.setTelefone(telefone);
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.replace("-", "");
    }

    public void prefixarDigito(int digito) {
        this.telefone = String.valueOf(digito) + this.telefone;
    }

    public void prefixarDigito(String digito) {
        this.telefone = digito + this.telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public int obterDigitos() {
        return this.telefone.length();
    }

    public String formatarTelefone(boolean adicionarHifen) {
        String _telefone = this.telefone;
        int quantidadeDigitos = _telefone.replace("-", "").length();
        int index = 4;
        if (quantidadeDigitos == 9)
            index = 5;
        if (adicionarHifen)
            return _telefone.substring(0, index) + "-" + _telefone.substring(index);
        return telefone;

    }
}