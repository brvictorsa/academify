package br.com.academify.controllers;

import br.com.academify.model.Aluno;
import br.com.academify.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    private ResponseEntity<Aluno> responseEntity;

    @GetMapping(value = "/listar")
    public List<Aluno> listar() {
        return repository.findAll();
    }
}
