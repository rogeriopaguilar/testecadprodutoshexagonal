package teste.hexagonal.application.service;

import teste.hexagonal.application.port.in.ProdutoUseCase;
import teste.hexagonal.application.port.out.ProdutoRepository;
import teste.hexagonal.model.Produto;

import java.util.List;

public class ProductService implements ProdutoUseCase {


    ProdutoRepository produtoRepository;

    public ProductService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto createProduto(String nome, int quantidade) {
        return produtoRepository.save(nome, quantidade);
    }
}
