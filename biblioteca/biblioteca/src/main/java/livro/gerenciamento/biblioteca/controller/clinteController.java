package livro.gerenciamento.biblioteca.controller;

import jakarta.validation.Valid;
import livro.gerenciamento.biblioteca.domain.cliente.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class clinteController {

    @Autowired
    private clinteRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados, UriComponentsBuilder uriBuider){
        var cliente = new cliente(dados);

        repository.save(cliente);


    }
    @GetMapping
     public ResponseEntity<Page<DadosListagemclintes>> listar(@PageableDefault(size = 10 , sort = {"nome"}) Pageable paginacao){
        var page = repository.findAllByAtivoTrue(paginacao).map(DadosListagemclintes::new);
        return ResponseEntity.ok(page);

    }
    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizarCadastroClinte daddos){
        var cliente = repository.getReferenceById(daddos.id());
        cliente.atualizarInformacoes(daddos);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id){
      var cliente =  repository.getReferenceById(id);
      cliente.excluir();
      return ResponseEntity.noContent().build();
    }


}
