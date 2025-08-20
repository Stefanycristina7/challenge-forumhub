package com.stefany.challenge.forumhub.model;

public enum StatusDoTopico {
    ABERTO, //Pode ter respodido, mas o usuario ainda não confirmou que tirou a duvida
    FECHADO, //O usuario fechou o topico e não poderá mais receber mensagens
    RESOLVIDO, //A duvida foi tirada
    SEM_RESPOSTA //Ainda não foi respondido
}
