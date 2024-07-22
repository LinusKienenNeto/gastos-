package com.example.meusgatos.domain.model;

import java.util.Date;
import java.util.List;
import org.hibernate.annotations.ManyToAny;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Produto {
   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid_produto")
    private String id;

    private String nome;

    private String descricao;

    @ManyToAny
    private List<Usuario> usuario;

    private Date dataCadastro;

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

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
