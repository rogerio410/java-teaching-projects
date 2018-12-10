package application;

import utils.Path;

import static spark.Spark.*;

public class App {

    // http://localhost:4567/
    public static void main(String[] args) {

        staticFiles.location("/public");
        staticFiles.expireTime(600L);

        // Quadro
        get(Path.Web.INDEX, QuadroController.listarQuadros);
        post(Path.Web.SALVAR_QUADRO, QuadroController.novoQuadro);
        get(Path.Web.TOGGLE_FAVORITO, QuadroController.toggleFavorito);
        get(Path.Web.MOSTRAR_QUADRO, QuadroController.mostrarQuadro);

        // Lista
        post(Path.Web.SALVAR_LISTA, QuadroController.novaLista);


    }

}
