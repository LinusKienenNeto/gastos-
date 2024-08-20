package com.example.meusgatos.domain.service;

import java.util.List;

//Criado como interface para ser implementado em outro local.
public interface ICRUDService<Req, Res> {

    List<Res> obterTodos();
    Res obterPorId(Long id);
    Res cadastrar(Req dto);
    Res atualizar(Long id, Req dto);
    void deletar(Long id);

}
