package modelo;

import exceptions.SaldoInsuficienteException;
import exceptions.SaqueComValorNegativoException;

public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{

        if (valor < 1){
            throw new SaqueComValorNegativoException(valor);
        }

        if (valor > this.saldo){
            throw new SaldoInsuficienteException();
        }

        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
