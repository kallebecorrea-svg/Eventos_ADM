package com.eventos.eventos_api.entity;

/**
 * Representa os possíveis estados do ciclo de vida de um evento.
 * No singular (StatusEvento) para bater com a entidade Evento e o tipo no PostgreSQL (status_evento).
 */
public enum StatusEvento {
    RASCUNHO,  // Evento recém-criado, ainda não visível ao público
    PUBLICADO, // Evento aberto e visível para inscrições
    CANCELADO, // Evento cancelado pelo organizador
    ENCERRADO  // Evento que já aconteceu
}
