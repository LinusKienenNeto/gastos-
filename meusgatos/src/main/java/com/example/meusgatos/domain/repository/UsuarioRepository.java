package com.example.meusgatos.domain.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.meusgatos.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Lista os usuarios dentro do banco de dados
    List<Usuario> findByEmail(String email);

}
