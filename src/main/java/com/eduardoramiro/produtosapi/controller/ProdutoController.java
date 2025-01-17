package com.eduardoramiro.produtosapi.controller;

import com.eduardoramiro.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe que recebe as requisições REST relacionadas a produtos.
 */
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    /**
     * Método que recebe uma requisição POST para salvar um produto.
     * @param produto o produto a ser salvo.
     */
    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto) {
        System.out.println("Produto recebido!" + produto);
        return produto;
    }
}
