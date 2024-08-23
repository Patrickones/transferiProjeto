package com.example.cadastro.repository.user;

import com.example.cadastro.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsuario(String usuario);
}
