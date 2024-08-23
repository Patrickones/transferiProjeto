package com.example.cadastro.dto;

public record UserDTO(

        Long codPessoaUser,
        String usuario,
        String senha,
        String desEmail,
        Integer codSetor) {
}
