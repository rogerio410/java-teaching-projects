package application;

import model.Quadro;
import spark.Request;
import spark.Response;
import spark.Route;
import utils.Path;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utils.ViewUtil.renderTemplate;


class QuadroController {

    private static List<Quadro> quadros = new ArrayList<>();

    static Route listarQuadros = (request, response) -> {

        Map<String, Object> model = new HashMap<>();
        model.put("quadros", quadros);

        return renderTemplate(request, model, Path.Template.INDEX);
    };


    static  Route novoQuadro = (request, response) -> {

        String nome = request.queryParams("nome-quadro");

        Quadro quadro = new Quadro(nome);
        quadros.add(quadro);

        response.redirect(Path.Web.INDEX);

        return "";
    };


    static Route mostrarQuadro = (request, response) -> {
        String nome = request.params(":nome-quadro");

        Quadro quadro = null;

        for (Quadro q: quadros) {
            if (q.getNome().equals(nome)){
                quadro = q;
                Map<String, Object> model = new HashMap<>();
                model.put("quadro", quadro);

                return renderTemplate(request, model, Path.Template.QUADRO);
            }
        }

        response.redirect(Path.Web.INDEX);

        return "";

    };


    static Route toggleFavorito = (request, response) -> {

        String nome = request.params(":nome-quadro");

        for (Quadro q: quadros) {
            if (q.getNome().equals(nome)){
                q.toggleFavorite();
            }
        }

        response.redirect(Path.Web.INDEX);

        return "";
    };


    static Route novaLista = (request, response) -> {

        String nomeQuadro = request.params("nome-quadro");
        String nomeLista = request.queryParams("nome-lista");

        for (Quadro q: quadros) {
            if (q.getNome().equals(nomeQuadro)){
                q.addLista(nomeLista);
            }
        }

        response.redirect(Path.Web.MOSTRAR_QUADRO.replace(":nome-quadro", nomeQuadro));
        return "";
    };


}
