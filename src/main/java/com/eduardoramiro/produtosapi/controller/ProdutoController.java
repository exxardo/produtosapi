package com.eduardoramiro.produtosapi.controller;

import com.eduardoramiro.produtosapi.model.Produto;
import com.eduardoramiro.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

/**
 * Classe que recebe as requisições REST relacionadas a produtos.
 */
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    /**
     * Repositório de armazenamento dos produtos.
     */
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    /**
     * Método que recebe uma requisição POST para salvar um produto.
     * @param produtoInformado refere-se ao produto a ser salvo que foi informado atrvés do endpoint.
     */
    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produtoInformado) {
        System.out.println("Produto recebido!" + produtoInformado);

        // Gera um id único e atribui ao produto que foi informado.
        var id = UUID.randomUUID().toString();
        produtoInformado.setId(id);

        // Salva o produto no banco de dados.
        produtoRepository.save(produtoInformado);

        return produtoInformado;
    }

    @GetMapping("/{id}") // Está entre chaves porque é um parâmetro da URL.
    public Produto obterProdutoId(@PathVariable("id") String id) {
        // Optional<Produto> produto = produtoRepository.findById(id);
        // return produto.isPresent() ? produto.get() : null;
        return produtoRepository.findById(id).orElse(null);
    }
}
