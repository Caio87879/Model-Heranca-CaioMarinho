public class Stark extends SousouFrieren {
    String ruivo;
    String mestre;
    int forca;

    public Stark() {

        super();
    }
    public Stark(String nome, int idade, String arma, String ruivo, String mestre, int forca){

        super(nome, idade, arma);

        this.ruivo = ruivo;
        this.mestre = mestre;
        this.forca = forca;

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
    public String getRuivo() {
        return ruivo;
    }
    public String getMestre() {
        return mestre;
    }
    public int getForca() {
        return forca;
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
    public void setRuivo(String ruivo) {
        this.ruivo = ruivo;
    }
    public void setMestre(String mestre) {
        this.mestre = mestre;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

}
