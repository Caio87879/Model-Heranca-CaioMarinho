public class Fern extends SousouFrieren {
    String poder;
    int tamanho;
    int velocidade;

    public Fern() {

        super();
    }
    public Fern(String nome, int idade, String arma, String poder, int tamanho, int velocidade){

        super(nome, idade, arma);

        this.poder = poder;
        this.tamanho = tamanho;
        this.velocidade = velocidade;

}
    @Override
    public String getNome() {
    return super.getNome();
    }
    @Override
    public int getIdade() {
        return super.getIdade();
    }
    @Override
    public String getArma() {
        return super.getArma();
    }
    public String getPoder() {
        return poder;
    }
    public int getTamanho() {
        return tamanho;
    }
    public int getVelocidade() {
        return velocidade;
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }
    @Override
    public void setArma(String arma) {
        super.setArma(arma);
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

}
