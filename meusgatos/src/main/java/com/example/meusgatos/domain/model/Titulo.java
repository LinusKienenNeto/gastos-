package com.example.meusgatos.domain.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Titulo {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idTitulo", nullable = false )
    private String id;

    @Column(name = "nome_Titulo", nullable = false)
    private String nome;

    @Column(name = "descricao_titulo", nullable = true)
    private String descricao;

    @Column(name = "dt_cadastro", nullable = false)
    private Date dataCadastro;

    private Date dataDesativacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataDesativacao() {
        return dataDesativacao;
    }

    public void setDataDesativacao(Date dataDesativacao) {
        this.dataDesativacao = dataDesativacao;
    }

   

    
    
}