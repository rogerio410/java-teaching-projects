package model;

public class Lista {

    private String nome;

    public Lista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
