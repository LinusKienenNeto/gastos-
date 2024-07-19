package com.example.meusgatos.domain.model;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Produto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduto")
    private String id;

    private String nome;

    private String descricao;

    @ManyToAny
    private List<Usuario> usuario;

    private Date dataCadastro;

}
