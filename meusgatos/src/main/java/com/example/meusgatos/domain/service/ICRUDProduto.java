package com.example.meusgatos.domain.service;

import java.util.List;

public interface ICRUDProduto<Req, Res> {
    
    List<Res> obterTodos();

    Res obterPorId(Long id);

    Res cadastrar(Req id, Req dto);

    void deletar(Long id);
    
}
