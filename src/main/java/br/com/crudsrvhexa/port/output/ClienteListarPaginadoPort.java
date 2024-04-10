package br.com.crudsrvhexa.port.output;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.crudsrvhexa.domain.entity.ClienteListarPaginadoEntity;

public interface ClienteListarPaginadoPort {
	
	Page<ClienteListarPaginadoEntity> listar(Pageable pageable, Integer codigoRoteiro);

}
