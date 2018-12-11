package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compra {

    private List<ItemCompra> itens;
    private Promocao promocao;

    public Compra(Promocao promocao) {
        this.itens = new ArrayList();
        this.promocao = promocao;
    }

    public double valorTotal(){

        double total = 0;
        for (ItemCompra item: itens) {
            total += item.valor();
        }

        return total;
    }

    public double valorAPagar(){
        return valorTotal() - descontos();
    }

    public double descontos() {
        return promocao.descontos(this);
    }

    public void addItem(Produto produto, int qtd){
        this.itens.add(new ItemCompra(produto, qtd));
    }

    public void addItem(Produto produto){
        addItem(produto, 1);
    }

    public List<ItemCompra> getItens() {
        return Collections.unmodifiableList(itens);
    }


    public interface Promocao {

        public double descontos(Compra compra);

    }

}
