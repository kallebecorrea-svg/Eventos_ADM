package com.eventos.eventos_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

/**
 * Entidade que mapeia a tabela "usuario" no banco PostgreSQL.
 */

@Entity
@Table (name = "usuario") // Nome exato da tabela no banco
@Getter // Lombok: gera automaticamente os métodos get (getId, getNome, etc.)
@Setter // Lombok: gera automaticamente os métodos set (setNome, setEmail, etc.)
@NoArgsConstructor  // Lombok: gera o construtor vazio obrigatório pelo JPA

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, unique = true, length = 160)
    private String email;

    @Column(name = "senha_hash", nullable = false)
    private String senhaHash;

    @Enumerated(EnumType.STRING)
    @JdbcTypeCode(SqlTypes.NAMED_ENUM) // Avisa ao Hibernate que no PostgreSQL é um ENUM nativo (CREATE TYPE)
    @Column(nullable = false)
    private Papel papel;

    @CreationTimestamp
    @Column(name = "criado_em", updatable = false)
    private LocalDateTime criadoEm;

}
