package com.alura.foro_hub;

public record ListaAutor(
        long id,
        String nombre,
        String email
) {
    public ListaAutor(Autor autor){
        this(autor.getId(), autor.getNombre(), autor.getCorreo());
    }

}