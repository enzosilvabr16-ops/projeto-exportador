package cotiinformatica.services;

import cotiinformatica.entities.Produto;
import cotiinformatica.interfaces.ProdutoRepository;
import cotiinformatica.repositories.ProdutoJsonRepository;
import cotiinformatica.repositories.ProdutoXmlRepository;

import javax.swing.*;
import java.util.Date;
import java.util.UUID;

public class ProdutoService {

    public void cadastrarProduto() {

        var produto = new Produto();

        produto.setId(UUID.randomUUID());
        produto.setDataHoraCadastro(new Date());

        produto.setNome(JOptionPane.showInputDialog("Informe o nome do produto:"));
        produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto:")));
        produto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto:")));

        var opcao = JOptionPane.showInputDialog("Informe (1) XML ou (2) JSON:");

        ProdutoRepository produtoRepository;
        switch (Integer.parseInt(opcao)) {
            case 1:
                produtoRepository = new ProdutoXmlRepository();
                break;
            case 2:
                produtoRepository = new ProdutoJsonRepository();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                return;
        }

        try {

            produtoRepository.exportarDados(produto);
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
        }
        catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
