public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro();
        meuLivro.nome = "Nunes O Caçador";
        meuLivro.preco = 1000.99;
        meuLivro.paginas = 521;
        meuLivro.resumo = "nunestopnunestopnunestopnunestop";
        meuLivro.autor = "Lucas o precoçe";

        meuLivro.aplicarDesconto(0.1);
        meuLivro.acrescentarTaxa();

        meuLivro.exibirDados();

        Livro LivroFavorito = new Livro();
        LivroFavorito.nome = "Eduardo peida xereca";
        LivroFavorito.resumo = "eduardo foi no bosque passear";
        LivroFavorito.paginas = 666;
        LivroFavorito.preco = 100.99;
        LivroFavorito.autor = "Nunes peida arroto";

        LivroFavorito.aplicarDesconto(0.25);
        LivroFavorito.acrescentarTaxa();

        LivroFavorito.exibirDados();
    }
}
