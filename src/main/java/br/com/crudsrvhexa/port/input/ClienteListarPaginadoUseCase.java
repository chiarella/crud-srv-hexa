package br.com.crudsrvhexa.port.input;


import org.springframework.data.domain.Pageable;

import br.com.crudsrvhexa.domain.entity.PaginacaoEntity;

public interface ClienteListarPaginadoUseCase {

	PaginacaoEntity buscar(Pageable page, Integer codigoCliente);

}
