package br.com.crudsrvhexa.adapter.input.resource;

import java.net.BindException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudsrvhexa.adapter.input.ClienteCriarSwagger;
import br.com.crudsrvhexa.adapter.input.request.ClienteRequest;
import br.com.crudsrvhexa.adapter.input.response.ClienteResponse;
import br.com.crudsrvhexa.adapter.mapper.ClienteMapper;
import br.com.crudsrvhexa.domain.entity.ClienteEntity;
import br.com.crudsrvhexa.port.input.ClienteCriarUseCase;
import jakarta.validation.Valid;

@RestController
public class ClienteCriarController implements ClienteCriarSwagger{
	
	private final ClienteCriarUseCase clienteCriarUseCase;
	private final ClienteMapper clienteMapper;
	
	public ClienteCriarController(
			ClienteCriarUseCase clienteCriarUseCase, 
			ClienteMapper clienteMapper) {
		this.clienteCriarUseCase = clienteCriarUseCase;
		this.clienteMapper = clienteMapper;
	}



	@Override
	public ResponseEntity<ClienteResponse> criarCliente(@Valid ClienteRequest clienteRequest) throws BindException {
		ClienteEntity clienteEntity = clienteCriarUseCase.criarCliente(clienteMapper.toEntity(clienteRequest));
		return new ResponseEntity<>(clienteMapper.toClienteResponse(clienteEntity), HttpStatus.CREATED);
	}

}

