package teste.hexagonal.adapter.rest;


import teste.hexagonal.application.port.in.ProdutoUseCase;

import java.util.List;

//@Reques
public class ProdutoController {

    ProdutoUseCase produtoUseCase;

    public ProdutoController(ProdutoUseCase produtoUseCase) {
        this.produtoUseCase = produtoUseCase;
    }


    public List<ListaProdutoFromDomain> findAll() {
        return this.produtoUseCase.findAll().stream().map((p) -> new ListaProdutoFromDomain(p.getId(), p.getNome(), p.getQuantidade())).toList();
    }
}
