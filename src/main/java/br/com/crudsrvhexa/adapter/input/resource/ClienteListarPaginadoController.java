package br.com.crudsrvhexa.adapter.input.resource;


import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudsrvhexa.adapter.input.ClienteListarPaginadoSwagger;
import br.com.crudsrvhexa.adapter.input.response.PaginacaoResponse;
import br.com.crudsrvhexa.adapter.mapper.PaginacaoMapper;
import br.com.crudsrvhexa.port.input.ClienteListarPaginadoUseCase;

@RestController
public class ClienteListarPaginadoController implements ClienteListarPaginadoSwagger{
	
	private final ClienteListarPaginadoUseCase clienteListarPaginadoUseCase;
	private final PaginacaoMapper paginacaoMapper;

	public ClienteListarPaginadoController(
			ClienteListarPaginadoUseCase clienteListarPaginadoUseCase,
			PaginacaoMapper paginacaoMapper) {
		this.clienteListarPaginadoUseCase = clienteListarPaginadoUseCase;
		this.paginacaoMapper = paginacaoMapper;
	}


	@Override
	public ResponseEntity<PaginacaoResponse> filtrar(Pageable page, Integer codigoCliente) {
		return ResponseEntity.ok(paginacaoMapper.toEntity(this.clienteListarPaginadoUseCase.buscar(page, codigoCliente)));
	}

}
