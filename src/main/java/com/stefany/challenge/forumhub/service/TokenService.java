//package com.stefany.challenge.forumhub.service;
//
//import java.time.Instant;
//
//import static org.springframework.security.config.Elements.JWT;
//
//public class TokenService {
//    public String gerarToken(Usuario usuario) {
//        try {
//            var algoritmo = Algorithm.HMAC256();
//            return JWT.create()
//                    .withIssuer("Api forum hub")
//                    .withSubject(usuario.getLogin())
//                    .withExpiresAt(dataExpiracao())
//                    .sign(algoritmo);
//        } catch (JWTCreationException exception){
//            throw new RuntimeException("erro ao gerrar token jwt", exception);
//        }
//    }
//
//    private Instant dataExpiracao() {
//        return
//    }
//
//}
