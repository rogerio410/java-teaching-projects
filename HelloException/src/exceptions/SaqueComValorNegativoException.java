package exceptions;

public class SaqueComValorNegativoException extends RuntimeException{

    public SaqueComValorNegativoException(double valor) {
        super("Você tentou sacar o valor negativo: " + valor);
    }
}
