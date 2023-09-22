package livro.gerenciamento.biblioteca.domain.livro;

public record DadosListagemLivros(
        Long id,
        String titulo,
        String autor,
        String genero,
        String publicado) {

public DadosListagemLivros (livro Livros){
       this(Livros.getId(),
            Livros.getTitulo(),
            Livros.getAutor(),
            Livros.getGenero(),
            Livros.getPublicado());
}


}
