package com.eventos.eventos_api.entity;

/**
 * Representa o estado da inscrição de um participante em um evento.
 */

public enum StatusInscricao {
    CONFIRMADA,     // Inscrição garantida com ingresso emitido (deve ser feminino pois no banco é 'CONFIRMADA')
    LISTA_ESPERA,   // Vagas esgotadas, aguardando desistência
    CANCELADA       // Inscrição cancelada pelo participante ou organizador
}
