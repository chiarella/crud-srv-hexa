package br.com.crudsrvhexa.port.input;

import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;

public interface ClienteEditarUseCase {

	ClienteIdEntity editar(Long codigoCliente, String nome, String cpf);

}
