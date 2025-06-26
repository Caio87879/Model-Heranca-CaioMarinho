public class Frieren extends SousouFrieren {
    String raca;
    String magia;
    int mana;

    public Frieren() {

        super();
    }
    public Frieren(String nome, int idade, String arma, String raca, String magia, int mana){

        super(nome, idade, arma);

        this.raca = raca;
        this.magia = magia;
        this.mana = mana;

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
    public String getRaca() {
        return raca;
    }
    public String getMagia() {
        return magia;
    }
    public int getMana() {
        return mana;
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
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setMagia(String magia) {
        this.magia = magia;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

}
