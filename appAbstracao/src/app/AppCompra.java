package app;

import models.*;

public class AppCompra {

    public static void main(String[] args) {

        Produto mac = new Produto("Mac Air 2019", 9000);
        Produto iphone = new Produto("iPhone XR", 8000);
        Produto relogio = new Produto("Apple W.", 2000);

        Promo5Tudo promo5 = new Promo5Tudo();

//        Compra compra = new Compra(new PromocaoOld() {
//            @Override
//            public double descontos(Compra compra) {
//                return compra.valorTotal() * 0.5;
//            }
//        });

        Compra.Promocao promo15 = new Compra.Promocao() {
            @Override
            public double descontos(Compra compra) {
                return 100;
            }
        };

        Compra.Promocao promo100 = c -> 100;

        //Compra compra = new Compra(c -> c.valorTotal() * 0.5);
        Compra compra = new Compra(promo100);



        compra.addItem(mac);
        compra.addItem(iphone, 3);

        //compra.getItens().add(new ItemCompra(relogio, 3));


        System.out.println("Valor Total: " + compra.valorTotal());
        System.out.println("Descontos  : " + compra.descontos());
        System.out.println("Vlr a Pagar: " + compra.valorAPagar());

    }

}
