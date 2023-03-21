public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro();
        meuLivro.nome = "Nunes O Caçador";
        meuLivro.preco = 1000.99;
        meuLivro.paginas = 521;
        meuLivro.resumo = "nunestopnunestopnunestopnunestop";
        meuLivro.autor = "Lucas o precoçe";

        meuLivro.exibirDados();

        Livro LivroFavorito = new Livro();
        LivroFavorito.nome = "Eduardo peida xereca";
        LivroFavorito.resumo = "eduardo foi no bosque passear";
        LivroFavorito.paginas = 666;
        LivroFavorito.preco = 1000000000000000000000000000000.99;
        LivroFavorito.autor = "Nunes peida arroto";

        LivroFavorito.exibirDados();
    }
}
