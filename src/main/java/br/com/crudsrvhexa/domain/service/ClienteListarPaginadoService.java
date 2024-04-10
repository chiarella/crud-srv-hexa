package br.com.crudsrvhexa.domain.service;


import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import br.com.crudsrvhexa.domain.entity.PaginacaoEntity;
import br.com.crudsrvhexa.port.input.ClienteListarPaginadoUseCase;
import br.com.crudsrvhexa.port.output.ClienteListarPaginadoPort;

@Service
public class ClienteListarPaginadoService implements ClienteListarPaginadoUseCase {

	private final ClienteListarPaginadoPort clienteListarPaginadoPort;
	
	public ClienteListarPaginadoService(ClienteListarPaginadoPort clienteListarPaginadoPort) {
		this.clienteListarPaginadoPort = clienteListarPaginadoPort;
	}

	@Override
	public PaginacaoEntity buscar(Pageable page, Integer codigoCliente) {
		var lista = this.clienteListarPaginadoPort.listar(page, codigoCliente);
		if (lista.getContent().isEmpty()) {
			throw new NotFoundException("Cliente não encontrado");
		}
		PaginacaoEntity paginacaoEntity = new PaginacaoEntity();
		paginacaoEntity.setTotalPage(lista.getTotalPages());
		paginacaoEntity.setPage(lista.getNumber());
		paginacaoEntity.setSize(lista.getTotalElements());
		paginacaoEntity.setData(lista.getContent());
		
		return paginacaoEntity;
	}

}
