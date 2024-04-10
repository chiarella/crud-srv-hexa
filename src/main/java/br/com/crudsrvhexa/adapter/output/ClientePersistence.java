package br.com.crudsrvhexa.adapter.output;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import br.com.crudsrvhexa.adapter.mapper.ClienteMapper;
import br.com.crudsrvhexa.adapter.output.data.ClienteJpa;
import br.com.crudsrvhexa.adapter.output.repository.ClienteRepository;
import br.com.crudsrvhexa.domain.entity.ClienteEntity;
import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;
import br.com.crudsrvhexa.domain.entity.ClienteListarPaginadoEntity;
import br.com.crudsrvhexa.port.output.ClienteBuscaPorIdPort;
import br.com.crudsrvhexa.port.output.ClienteEditarPort;
import br.com.crudsrvhexa.port.output.ClienteExcluirPort;
import br.com.crudsrvhexa.port.output.ClienteListarPaginadoPort;
import br.com.crudsrvhexa.port.output.ClienteSalvarPort;

@Component
public class ClientePersistence implements 
	ClienteSalvarPort, ClienteListarPaginadoPort, ClienteBuscaPorIdPort, ClienteExcluirPort, ClienteEditarPort{
	
	
	private final ClienteRepository clienteRepository;
	private final ClienteMapper clienteMapper;

	public ClientePersistence(
			ClienteRepository clienteRepository,
			ClienteMapper clienteMapper) {
		this.clienteRepository = clienteRepository;
		this.clienteMapper = clienteMapper;
	}

	@Override
	public ClienteEntity salvarCliente(ClienteEntity clienteEntity) {
		ClienteJpa cliente = clienteMapper.toClienteMapper(clienteEntity);
		cliente = clienteRepository.save(cliente);
		return clienteMapper.toClienteEntity(cliente);
	}

	@Override //Busca paginada com codigo de cliente dentro
	public Page<ClienteListarPaginadoEntity> listar(Pageable pageable, Integer codigoCliente) {
		var clienteJpa = this.clienteRepository.filtrar(pageable, codigoCliente);
		List<ClienteListarPaginadoEntity> clienteEntities = new ArrayList<>();
			clienteJpa.forEach(c ->{
				ClienteListarPaginadoEntity entidade =  new ClienteListarPaginadoEntity();
				entidade.setCodigoCliente(c.getCodigoCliente());
				entidade.setNome(c.getNome());
				entidade.setCpf(c.getCpf());
				clienteEntities.add(entidade);
			});
		return new PageImpl<>(clienteEntities, pageable, clienteJpa.getTotalElements());
	}

	@Override
	public ClienteIdEntity buscar(Long codigoCliente) {
		ClienteJpa cliente = clienteRepository.findById(codigoCliente).orElse(null);
		return clienteMapper.toClienteIdEntity(cliente);
	}

	@Override
	//@Transactional -> para OneToMany
	public String excluir(Long codigoCliente) {
		
		try {
			//entityManager.clear();
			clienteRepository.deleteById(codigoCliente);
			
			return "Cliente excluido com sucesso";
		} catch (Exception e) {
			return "Erro ao excluir cliente: " + e.getMessage();
		}
	}

	@Override
	public ClienteIdEntity editar(ClienteIdEntity clienteIdEntity) {
		ClienteJpa clienteJpa = clienteMapper.toClienteIdJpa(clienteIdEntity);
		clienteJpa = clienteRepository.save(clienteJpa);
		return clienteMapper.toClienteIdEntity(clienteJpa);
	}

	@Override
	public JpaRepository<ClienteJpa, Long> getClienteRepository() {
		return clienteRepository;
	}
	
}

