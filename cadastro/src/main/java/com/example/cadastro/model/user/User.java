package com.example.cadastro.model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "CM_USER")
@Entity
public class User {

    @Id
    private Long codPessoaUser;

    @NotBlank
    private String usuario;

    @NotBlank
    private String senha;

    @NotBlank
    @Email
    private String desEmail;

    @NotBlank
    private Integer codSetor;

    public User(Long codPessoaUser, String usuario, String senha, String desEmail, Integer codSetor) {
        this.codPessoaUser = codPessoaUser;
        this.usuario = usuario;
        this.senha = senha;
        this.desEmail = desEmail;
        this.codSetor = codSetor;
    }
}
