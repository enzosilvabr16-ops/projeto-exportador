package cotiinformatica;

import cotiinformatica.services.ProdutoService;

public class Main {

    static void main() {
        var service = new ProdutoService();
        service.cadastrarProduto();

    }
}
