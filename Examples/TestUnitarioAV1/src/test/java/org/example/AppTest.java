package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    private Produto produto;
    private Venda venda;

    @Test
    public void criarProdutoComValorValido() {
        produto = new Produto("Arroz", 7.50, 40);

        Assertions.assertEquals("Arroz", produto.getNome());
        Assertions.assertEquals(7.50, produto.getPreco());
        Assertions.assertEquals(40, produto.getEstoque());
    }

    @Test
    public void criarProdutoComProdutoComPrecoNegativo() {
        produto = new Produto("Arroz", 7.50, 40);

        Assertions.assertEquals(40, produto.getEstoque());
    }

    @Test
    public void criarProdutoComEstoqueNegativo() {
        produto = new Produto("Arroz", 7.50, 40);

        Assertions.assertEquals(-20, produto.getEstoque());
    }

    @Test
    public void alterarNomeValido() {}

    @Test
    public void alterarPrecoValido() {}

    @Test
    public void alterarEstoqueParaValorPositivo() {}

    @Test
    public void alterarEstoqueParaValorNegativo () {}

    @Test
    public void realizarVendaComQuantidadeMenorQueEstoque() {}

    @Test
    public void realizarVendaComQuantidadeIgualQueEstoque() {}

    @Test
    public void realizarVendaComQuantidadeMaiorQueEstoque() {}

    @Test
}
