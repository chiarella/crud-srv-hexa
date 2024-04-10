package br.com.crudsrvhexa.port.output;

import br.com.crudsrvhexa.domain.entity.ClienteEntity;

public interface ClienteSalvarPort {
	
	ClienteEntity salvarCliente(ClienteEntity clienteEntity);

}
