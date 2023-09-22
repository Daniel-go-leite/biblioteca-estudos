package livro.gerenciamento.biblioteca.domain.livro;

import jakarta.validation.constraints.NotBlank;

public record DadosCdastroLivros(
        @NotBlank
        String titulo,
        @NotBlank
        String autor,
        @NotBlank
        String genero,
        @NotBlank
        String publicado) {
}
