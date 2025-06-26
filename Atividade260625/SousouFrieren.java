//Tema escolhido: Anime - Meu anime é Sousou no Frieren

public class SousouFrieren {
    private String nome;
    private int idade;
    private String arma;

    public SousouFrieren(){}

    public SousouFrieren (String nome, int idade, String arma){
        this.nome = nome;
        this.idade = idade;
        this.arma = arma;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getArma(){
        return arma;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }
}
