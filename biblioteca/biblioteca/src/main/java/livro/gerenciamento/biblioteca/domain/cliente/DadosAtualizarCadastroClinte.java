package livro.gerenciamento.biblioteca.domain.cliente;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizarCadastroClinte(
        @NotBlank
        Long id,
        String ameil,
        String telefone
        ) {
}
