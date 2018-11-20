package application;

import utils.Path;

import static spark.Spark.*;

public class App {

    // http://localhost:4567/
    public static void main(String[] args) {

        get(Path.Web.INDEX, QuadroController.listarQuadros);
        post(Path.Web.SALVAR_QUADRO, QuadroController.novoQuadro);
        get(Path.Web.TOGGLE_FAVORITO, QuadroController.toggleFavorito);

    }

}
