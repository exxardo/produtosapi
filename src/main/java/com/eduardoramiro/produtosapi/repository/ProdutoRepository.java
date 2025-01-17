package com.eduardoramiro.produtosapi.repository;

import com.eduardoramiro.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
