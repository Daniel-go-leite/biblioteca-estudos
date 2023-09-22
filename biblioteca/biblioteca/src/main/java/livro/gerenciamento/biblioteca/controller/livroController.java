package livro.gerenciamento.biblioteca.controller;


import jakarta.validation.Valid;
import livro.gerenciamento.biblioteca.domain.livro.DadosCdastroLivros;
import livro.gerenciamento.biblioteca.domain.livro.livro;
import livro.gerenciamento.biblioteca.domain.livro.livroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class livroController {

    @Autowired
    private livroRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCdastroLivros dados){
        repository.save(new livro(dados));


    }
    @GetMapping
    public Page<livro> listar(@PageableDefault(size = 10, sort = {"titulo"}) Pageable paginacao){
        return repository.findAll(paginacao);
    }

}
