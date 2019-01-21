package app;

import exceptions.SaldoInsuficienteException;
import exceptions.SaqueComValorNegativoException;
import modelo.Conta;

public class App {

    public static void main(String[] args) {

//        System.out.println("A");
//        try{
//            int a = 10 / 0;
//        }catch (Exception e){
//            System.out.println("Erro: "+e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println("B");

        Conta conta = new Conta(1000);
//        conta.sacar(100);
        try{
            conta.sacar(-12000);
        }catch (SaqueComValorNegativoException e){
            System.out.println(e.getMessage());
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }

        System.out.println(conta);

    }

}
