package app;

import models.*;

public class AppCompra {

    public static void main(String[] args) {

        Produto mac = new Produto("Mac Air 2019", 9000);
        Produto iphone = new Produto("iPhone XR", 8000);
        Produto relogio = new Produto("Apple W.", 2000);

        Compra compra = new Compra(new Promo5Tudo());
        compra.addItem(mac);
        compra.addItem(iphone, 3);

        //compra.getItens().add(new ItemCompra(relogio, 3));


        System.out.println("Valor Total: " + compra.valorTotal());
        System.out.println("Descontos  : " + compra.descontos());
        System.out.println("Vlr a Pagar: " + compra.valorAPagar());

    }

}
