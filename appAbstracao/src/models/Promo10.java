package models;

import java.util.List;

public class Promo10 implements Promocao{

    public double descontos(Compra compra){

        double desconto = 0;

        for (int i = 0; i < compra.getItens().size(); i++) {
            ItemCompra item = compra.getItens().get(i);
            if (item.getQuantidade() > 1){
                desconto += item.valor() * 0.1;
            }
        }

        return desconto;
    }

}
