package br.com.crudsrvhexa.domain.service;

import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;
import br.com.crudsrvhexa.port.input.ClienteExcluirUseCase;
import br.com.crudsrvhexa.port.output.ClienteBuscaPorIdPort;
import br.com.crudsrvhexa.port.output.ClienteExcluirPort;

@Service
public class ClienteExcluirService implements ClienteExcluirUseCase {
	
	private final ClienteBuscaPorIdPort clienteBuscaPorIdPort;
	private final ClienteExcluirPort clienteExcluirPort;
	
	public ClienteExcluirService(
			ClienteBuscaPorIdPort clienteBuscaPorIdPort,
			ClienteExcluirPort clienteExcluirPort) {
		this.clienteBuscaPorIdPort = clienteBuscaPorIdPort;
		this.clienteExcluirPort = clienteExcluirPort;
	}

	@Override
	public String excluir(Long codigoCliente) {
		ClienteIdEntity clienteEntity = clienteBuscaPorIdPort.buscar(codigoCliente);
		if(clienteEntity == null) {
			throw new NotFoundException("Cliente nao encontrado");
		}
		return clienteExcluirPort.excluir(codigoCliente);
	}
	

}
