package com.example.meusgatos.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meusgatos.domain.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
   //eu acho que esse Optional vai dar problema.
    @SuppressWarnings("null")
    Optional<Produto> findById(Long id);
}
