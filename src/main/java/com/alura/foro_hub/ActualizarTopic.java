package com.alura.foro_hub;

public record ActualizarTopic(
        String titulo,
        String mensaje,
        Boolean estado,
        String curso
) {

}