package model;

public class Quadro {

    private boolean favorito;
    private String nome;

    public Quadro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void toggleFavorite(){
        this.favorito = !this.favorito;
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "favorito=" + favorito +
                ", nome='" + nome + '\'' +
                '}';
    }

}
