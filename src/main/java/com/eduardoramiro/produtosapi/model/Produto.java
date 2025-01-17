package com.eduardoramiro.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Classe que representa os dados de um produto.
 * A anotação @Entity indica que a classe é uma entidade do banco de dados.
 * A anotação @Table indica o nome da tabela no banco de dados.
 * A anotação @Column indica o nome da coluna no banco de dados.
 * A anotação @Id indica que o atributo é a chave primária da tabela.
 */
@Entity
@Table(name = "tb_produtos") // Define o nome da tabela no banco de dados que será criada. Está entre aspas porque o nome da tabela é diferente do nome da classe.
public class Produto {

    @Id
    @Column
    private String id;
    @Column(name = "nome_produto")
    private String nomeProduto;
    @Column
    private String descricaoProduto;
    @Column
    private double precoProduto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    /**
     * Método que retorna uma representação textual do objeto.
     * @return uma representação textual do objeto.
     */
    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", precoProduto=" + precoProduto +
                '}';
    }
}
