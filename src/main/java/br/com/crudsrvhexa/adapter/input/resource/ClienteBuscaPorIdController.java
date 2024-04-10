package br.com.crudsrvhexa.adapter.input.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudsrvhexa.adapter.input.ClienteBuscaPorIdSwagger;
import br.com.crudsrvhexa.adapter.input.response.ClienteIdResponse;
import br.com.crudsrvhexa.adapter.mapper.ClienteMapper;
import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;
import br.com.crudsrvhexa.port.input.ClienteBuscaPorIdUseCase;

@RestController
public class ClienteBuscaPorIdController implements ClienteBuscaPorIdSwagger {
	
	private final ClienteBuscaPorIdUseCase clienteBuscaPorIdUseCase;
	private final ClienteMapper clienteMapper;
	
	public ClienteBuscaPorIdController(
			ClienteBuscaPorIdUseCase clienteBuscaPorIdUseCase,
			ClienteMapper clienteMapper) {
		this.clienteBuscaPorIdUseCase = clienteBuscaPorIdUseCase;
		this.clienteMapper = clienteMapper;
	}

	@Override
	public ResponseEntity<ClienteIdResponse> buscar(Long codigoCliente) {
		ClienteIdEntity cliente = clienteBuscaPorIdUseCase.buscar(codigoCliente);
		return ResponseEntity.ok(clienteMapper.toClienteIdResponse(cliente));
	}

}
