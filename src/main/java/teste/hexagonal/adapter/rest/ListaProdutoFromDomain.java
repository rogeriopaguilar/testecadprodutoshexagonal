package teste.hexagonal.adapter.rest;

import java.util.UUID;

public record ListaProdutoFromDomain(UUID id,
                                     String nome,
                                     int quantidade
) {
}
