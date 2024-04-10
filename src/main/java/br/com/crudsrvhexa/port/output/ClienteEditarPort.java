package br.com.crudsrvhexa.port.output;

import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;

public interface ClienteEditarPort {

	//JpaRepository<ClienteJpa, Long> getClienteRepository(); 
	ClienteIdEntity editar(ClienteIdEntity clienteIdEntity);
	

}