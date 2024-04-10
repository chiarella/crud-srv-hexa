package br.com.crudsrvhexa.port.output;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crudsrvhexa.adapter.output.data.ClienteJpa;
import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;

public interface ClienteBuscaPorIdPort {
	
	ClienteIdEntity buscar(Long codigoCliente);

	JpaRepository<ClienteJpa, Long> getClienteRepository();

}
