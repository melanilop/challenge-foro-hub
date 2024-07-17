package com.alura.foro_hub;

import jakarta.validation.constraints.NotNull;

public record ActualizarAutor(
        @NotNull
        long id,
        String nombre
) {
}