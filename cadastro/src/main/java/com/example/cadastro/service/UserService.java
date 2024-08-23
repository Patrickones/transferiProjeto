package com.example.cadastro.service;

import com.example.cadastro.model.user.User;
import com.example.cadastro.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repositorio;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Transactional
    public User registerUser(User user){
        if (repositorio.findByUsuario(user.getUsuario())!= null) {
            throw new RuntimeException("Usuario ja existe!");
        }

        user.setSenha(passwordEncoder.encode(user.getSenha()));

        return repositorio.save(user);
    }

}
