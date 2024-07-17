
package com.alura.foro_hub;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class ServicioToken {

    @Value("${api.security.secret}")
    private String apiSecret;

    public String generarToken(Autor autor) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(apiSecret);

            return JWT.create()
                    .withIssuer("ForoHub")
                    .withSubject(autor.getCorreo())
                    .withClaim("id", autor.getId())
                    .withExpiresAt(generarFechaExpiracion())
                    .sign(algorithm);
        } catch (JWTCreationException e) {
            throw new RuntimeException("Error al generar el token JWT", e);
        }
    }


    private Date generarFechaExpiracion() {
        LocalDateTime localDateTime = LocalDateTime.now().plusHours(2);
        Instant instant = localDateTime.toInstant(ZoneOffset.of("-05:00"));
        return Date.from(instant); // Convertir Instant a Date
    }


    public String getSubject(String token){
        if(token == null){
            throw new RuntimeException("Token nullo");
        }
        DecodedJWT verifier = null;
        try {
            Algorithm algorithm = Algorithm.HMAC256(apiSecret); //Validando firma
            verifier = JWT.require(algorithm)
                    // specify any specific claim validations
                    .withIssuer("ForoHub")
                    // reusable verifier instance
                    .build()
                    .verify(token);
            verifier.getSubject();
        } catch (JWTVerificationException exception){
            System.out.println(exception.toString());
        }

        if (verifier.getSubject() == null){
            throw new RuntimeException("Verifier invalido");
        }
        return verifier.getSubject();
    }
}