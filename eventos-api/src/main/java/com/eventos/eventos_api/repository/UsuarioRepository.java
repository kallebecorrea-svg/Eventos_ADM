package com.eventos.eventos_api.repository;

import com.eventos.eventos_api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


/**
 * Interface de acesso a dados da tabela usuario.
 * O Spring Data JPA cria as consultas SQL automaticamente a partir do nome dos métodos!
 */

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    // SELECT * FROM usuario WHERE email = ?
    // Retorna Optional para evitar NullPointerException caso o usuário não exista
    Optional<Usuario> findByEmail(String email);

    // SELECT COUNT(*) > 0 FROM usuario WHERE email = ?
    // Usado no cadastro para verificar se o e-mail já foi registrado
    boolean existsByEmail(String email);
} 