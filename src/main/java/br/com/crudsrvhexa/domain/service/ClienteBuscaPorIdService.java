package br.com.crudsrvhexa.domain.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.crudsrvhexa.adapter.output.data.ClienteJpa;
import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;
import br.com.crudsrvhexa.port.input.ClienteBuscaPorIdUseCase;
import br.com.crudsrvhexa.port.output.ClienteBuscaPorIdPort;

@Service
public class ClienteBuscaPorIdService implements ClienteBuscaPorIdUseCase {
	
	private static final String MSG_NOTFOUND = "Cliente não encontrado";
	
	private final ClienteBuscaPorIdPort clienteBuscaPorIdPort;
	//private final VerificarDadosCommon verificarDadosCommon;
	
	public ClienteBuscaPorIdService(
			ClienteBuscaPorIdPort clienteBuscaPorIdPort//,
			//VerificarDadosCommon verificarDadosCommon
			) {
		this.clienteBuscaPorIdPort = clienteBuscaPorIdPort;
		//this.verificarDadosCommon = verificarDadosCommon;
	}

	@Override
	public ClienteIdEntity buscar(Long codigoCliente) {
		JpaRepository<ClienteJpa, Long> test = clienteBuscaPorIdPort.getClienteRepository();
//		if(!verificarDadosCommon.verificarIdExistente(codigoCliente, test)) {
//			throw new IllegalArgumentException(MSG_NOTFOUND);
//		}
		
//		ClienteIdEntity cliente = clienteBuscaPorIdPort.buscar(codigoCliente);
//		if(cliente == null) {
//			throw new NotFoundException(MSG_NOTFOUND);
//		}
		return clienteBuscaPorIdPort.buscar(codigoCliente);
	}

}
