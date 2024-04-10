package br.com.crudsrvhexa.domain.service;

import org.springframework.stereotype.Service;

import br.com.crudsrvhexa.domain.entity.ClienteEntity;
import br.com.crudsrvhexa.port.input.ClienteCriarUseCase;
import br.com.crudsrvhexa.port.output.ClienteSalvarPort;

@Service
public class ClienteCriarService implements ClienteCriarUseCase{
	
	private final ClienteSalvarPort clienteSalvarPort;

	public ClienteCriarService(ClienteSalvarPort clienteSalvarPort) {
		this.clienteSalvarPort = clienteSalvarPort;
	}


	@Override
	public ClienteEntity criarCliente(ClienteEntity clienteEntity) {
//		if(clienteEntity.getCpf().equals("test")) {
//			throw new DataConflictException("digitar o cpf (DataConfictEx nao e a Exception Correta)");
//		}
		return clienteSalvarPort.salvarCliente(clienteEntity);
	}

}
