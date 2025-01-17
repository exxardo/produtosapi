package com.eduardoramiro.produtosapi.repository;

import com.eduardoramiro.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    @Query("SELECT p FROM Produto p WHERE LOWER(p.nomeProduto) = LOWER(:nomeProduto)")
    List<Produto> findByNomeProduto(String nomeProduto);
}
