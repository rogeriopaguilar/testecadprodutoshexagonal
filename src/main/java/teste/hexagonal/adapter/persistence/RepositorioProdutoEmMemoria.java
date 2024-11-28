package teste.hexagonal.adapter.persistence;

import teste.hexagonal.application.port.out.ProdutoRepository;
import teste.hexagonal.model.Produto;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class RepositorioProdutoEmMemoria implements ProdutoRepository {

    private Map<UUID, Produto> mapaProdutos = new ConcurrentHashMap<>();

    @Override
    public List<Produto> findAll() {
        return new LinkedList<Produto>(mapaProdutos.values());
    }

    @Override
    public Produto save(String nome, int quantidade) {
        Produto produto = new Produto(nome, quantidade);
        mapaProdutos.put(produto.getId(), produto);
        return produto;
    }
}
