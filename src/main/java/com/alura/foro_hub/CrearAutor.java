package com.alura.foro_hub;
import jakarta.validation.constraints.NotBlank;

public record CrearAutor(

        @NotBlank
        String nombre,
        @NotBlank
        String correo,
        @NotBlank
        String contrasena
) {
}