package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quadro {

    private boolean favorito;
    private String nome;
    private List<Lista> listas;

    public Quadro(String nome) {
        this.nome = nome;
        this.listas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void toggleFavorite(){
        this.favorito = !this.favorito;
    }

    public void addLista(String nome){
        this.listas.add(new Lista(nome));
    }

    public List<Lista> getListas() {
        return Collections.unmodifiableList(this.listas);
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "favorito=" + favorito +
                ", nome='" + nome + '\'' +
                '}';
    }

}
