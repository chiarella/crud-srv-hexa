package br.com.crudsrvhexa.domain.service;

import org.springframework.stereotype.Service;

import br.com.crudsrvhexa.domain.common.VerificarDadosCommon;
import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;
import br.com.crudsrvhexa.port.input.ClienteEditarUseCase;
import br.com.crudsrvhexa.port.output.ClienteEditarPort;

@Service
public class ClienteEditarService implements ClienteEditarUseCase {
	
	
	private final ClienteEditarPort clienteEditarPort;
	private final VerificarDadosCommon VerificarDadosCommon;

	public ClienteEditarService(
			ClienteEditarPort clienteEditarPort,
			VerificarDadosCommon verificarDadosCommon
			) {
		this.clienteEditarPort = clienteEditarPort;
		this.VerificarDadosCommon = verificarDadosCommon;
	}

	@Override
	public ClienteIdEntity editar(Long codigoCliente, String nome, String cpf) {
		//if(!verificarDadosCommon.ver)
		return clienteEditarPort.editar(new ClienteIdEntity(codigoCliente, nome, cpf));
	}

	

}

