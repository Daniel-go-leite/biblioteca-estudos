package livro.gerenciamento.biblioteca.domain.livro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "livros")
@Entity(name = "/livro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String genero;
    private String publicado;

    private boolean ativo;


    public livro(DadosCdastroLivros dados){
        this.ativo = true;
        this.titulo = dados.titulo();
        this.autor = dados.autor();
        this.genero = dados.genero();
        this.publicado = dados.publicado();

    }




}
