package com.alura.foro_hub;

public record RespuestaAutor(
        long id,
        String nombre,
        String correo
) {
    public RespuestaAutor(Autor autor){
        this(autor.getId(), autor.getNombre(), autor.getCorreo());
    }
}