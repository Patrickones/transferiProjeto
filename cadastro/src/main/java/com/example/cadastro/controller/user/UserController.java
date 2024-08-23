package com.example.cadastro.controller.user;

import com.example.cadastro.dto.UserDTO;
import com.example.cadastro.model.user.User;
import com.example.cadastro.repository.user.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/cadastro")
public class UserController {

    @Autowired
    private UserRepository repositorio;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid User dados, UriComponentsBuilder uriBuilder){
        var cadastro = new User(dados.getCodPessoaUser(), dados.getUsuario(), dados.getSenha(), dados.getDesEmail(), dados.getCodSetor());
        repositorio.save(cadastro);

    }
}
