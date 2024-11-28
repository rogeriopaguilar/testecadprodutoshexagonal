package teste.hexagonal.application.port.in;

import teste.hexagonal.model.Produto;

import java.util.List;

public interface ProdutoUseCase {

    List<Produto> findAll();

    Produto createProduto(String nome, int quantidade);
}
