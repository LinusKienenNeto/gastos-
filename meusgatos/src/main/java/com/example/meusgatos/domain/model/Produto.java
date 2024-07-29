package com.example.meusgatos.domain.model;

import java.util.Date;
import java.util.List;
import org.hibernate.annotations.ManyToAny;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Produto {
   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid_produto", nullable = false)
    private Long id;

    @Column(name = "nome_produto", nullable = false)
    private String nome;

    @Column(name = "descricao_produto", nullable = true)
    private String descricao;

    @ManyToAny
    private List<Usuario> usuario;

    @Column(name = "dt_cadastro", nullable = false)
    private Date dataCadastro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
