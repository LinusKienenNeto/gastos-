package com.example.meusgatos.domain.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.meusgatos.domain.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findById(String id);
}
