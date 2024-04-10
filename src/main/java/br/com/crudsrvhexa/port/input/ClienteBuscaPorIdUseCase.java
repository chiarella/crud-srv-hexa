package br.com.crudsrvhexa.port.input;

import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;

public interface ClienteBuscaPorIdUseCase {

	ClienteIdEntity buscar(Long codigoCliente);

}
