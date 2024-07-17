package com.alura.foro_hub;

public record RespuestaTopic(
        long id,
        String titulo,
        String mensaje,
        String fechaCreacion,
        String estado,
        String curso,
        RespuestaAutor autor
) {

    public RespuestaTopic(Topic topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getEstado() ? "Abierto" : "Cerrado",
                topico.getCurso(),
                new RespuestaAutor(topico.getAutor())
        );
    }

}