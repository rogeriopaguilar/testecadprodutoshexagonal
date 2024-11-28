package teste.hexagonal.application.port.out;

import teste.hexagonal.model.Produto;

import java.util.List;

public interface ProdutoRepository {
    List<Produto> findAll();

    Produto save(String nome, int quantidade);

}
