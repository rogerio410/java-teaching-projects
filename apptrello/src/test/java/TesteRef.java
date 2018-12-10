import model.Lista;
import model.Quadro;

public class TesteRef {

    public static void main(String[] args) {

        Quadro quadro = new Quadro("Quadro 1");

        quadro.addLista("POO");
        quadro.addLista("BD");

        System.out.println(quadro);
        print_listas(quadro);

        Quadro quadro2 = quadro;

        System.out.println(quadro2);
        print_listas(quadro2);

    }

    private static void print_listas(Quadro quadro) {
        for (Lista l: quadro.getListas()) {
            System.out.println(l);
        }
    }

}
