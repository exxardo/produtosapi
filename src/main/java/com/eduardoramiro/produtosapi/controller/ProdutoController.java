package com.eduardoramiro.produtosapi.controller;

import com.eduardoramiro.produtosapi.model.Produto;
import com.eduardoramiro.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
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
     * Endpoint que recebe uma requisição POST para salvar um produto.
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

    /**
     * Endpoint que recebe uma requisição GET para obter um produto pelo id.
     * @param id refere-se ao id do produto a ser obtido.
     */
    @GetMapping("/{id}") // Está entre chaves porque é um parâmetro da URL.
    public Produto obterProdutoId(@PathVariable("id") String id) {
        // Optional<Produto> produto = produtoRepository.findById(id);
        // return produto.isPresent() ? produto.get() : null;
        return produtoRepository.findById(id).orElse(null);
    }

    /**
     * Método que recebe uma requisição DELETE para deletar um produto pelo id.
     * @param id refere-se ao id do produto a ser deletado.
     */
    @DeleteMapping("/{id}")
    public void deletarProdutoID(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    /**
     * Endpoint que recebe uma requisição PUT para atualizar um produto pelo id.
     * @param id refere-se ao id do produto a ser atualizado.
     * @param produtoInformado refere-se ao produto a ser atualizado que foi informado atrvés do endpoint.
     */
    @PutMapping("/{id}")
    public void atualizarProdutoId(@PathVariable("id") String id, @RequestBody Produto produtoInformado) {
        produtoInformado.setId(id);
        produtoRepository.save(produtoInformado);
    }

    /**
     * Endpoint que recebe uma requisição GET para obter um produto pelo nome.
     * @param nomeProduto refere-se ao nome do produto a ser obtido.
     */
    @GetMapping
    public List<Produto> buscarProduto(@RequestParam("nomeProduto") String nomeProduto) {
        return produtoRepository.findByNomeProduto(nomeProduto);
    }
}
