package cotiinformatica.interfaces;

import cotiinformatica.entities.Produto;

public interface ProdutoRepository {

    void exportarDados(Produto produto) throws Exception;
}
