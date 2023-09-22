package livro.gerenciamento.biblioteca.domain.cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cliente")
@Entity(name = "/clientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;

    private boolean ativo;
    public cliente (DadosCadastroCliente dados){
          this.ativo = true;
          this.nome = dados.nome();
          this.email = dados.email();
          this.cpf = dados.telefone();
          this.telefone = dados.telefone();


    }


    public void atualizarInformacoes(DadosAtualizarCadastroClinte daddos) {
        if (daddos.ameil() != null){
            this.email = daddos.ameil();
        }
        if (daddos.telefone() != null){
            this.telefone = daddos.telefone();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
