package models;

public class Promo5Tudo implements Compra.Promocao {

    @Override
    public double descontos(Compra compra) {
        return compra.valorTotal() * 0.05;
    }

}
