package model;

import enums.CategoriaProduto;
public class Produto {
    private String nome;
    private double preco;
    private CategoriaProduto categoria;

    public Produto(String nome, double preco, CategoriaProduto categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }
}
