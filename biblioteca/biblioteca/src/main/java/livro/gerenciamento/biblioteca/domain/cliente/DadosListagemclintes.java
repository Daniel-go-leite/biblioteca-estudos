package livro.gerenciamento.biblioteca.domain.cliente;

public record DadosListagemclintes(
    Long id,
    String nome,
    String email,
    String cpf,
    String telefone){

    public DadosListagemclintes(cliente Clientes){
           this(Clientes.getId(),
                Clientes.getNome(),
                Clientes.getEmail(),
                Clientes.getCpf(),
                Clientes.getTelefone());
    }






}


