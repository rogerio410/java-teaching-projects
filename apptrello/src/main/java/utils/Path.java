package utils;

public class Path {

    public static class Web{
        public static final String INDEX = "/";
        public static final String SALVAR_QUADRO = "/salvar-quadro";
        public static final String TOGGLE_FAVORITO = "/toggle-favorito/:nome-quadro";
        public static final String MOSTRAR_QUADRO = "/mostrar-quadro/:nome-quadro";

        public static final String SALVAR_LISTA = "/salvar-lista/:nome-quadro";
    }

    public static class Template{
        public static final String QUADRO = "/ui/quadro.vm";
        public static final String INDEX = "/ui/index.vm";
    }

}
