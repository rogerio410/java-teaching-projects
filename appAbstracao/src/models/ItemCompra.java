package models;

public class ItemCompra {

    private Produto produto;
    private int quantidade;

    public ItemCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double valor(){
        return produto.getValor() * quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "ItemCompra{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
