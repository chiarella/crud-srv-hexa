package br.com.crudsrvhexa.port.input;

import br.com.crudsrvhexa.domain.entity.ClienteEntity;

public interface ClienteCriarUseCase {
	
	ClienteEntity criarCliente(ClienteEntity clienteEntity);

}
