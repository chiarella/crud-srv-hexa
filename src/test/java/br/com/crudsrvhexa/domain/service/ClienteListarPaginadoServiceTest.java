//package br.com.crudhexa.domain.service;
//
//import static org.mockito.Mockito.when;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyInt;
//
//
//import java.util.List;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//
//import br.com.crudhexa.domain.entity.ClienteListarPaginadoEntity;
//import br.com.crudhexa.domain.entity.PaginacaoEntity;
//import br.com.crudhexa.port.output.ClienteListarPaginadoPort;
//
//class ClienteListarPaginadoServiceTest {
//	
//	@Mock
//	ClienteListarPaginadoPort clienteListarPaginadoPort;
//	
//	@Mock
//	Page<ClienteListarPaginadoEntity> mockPage;
//	
//	@InjectMocks
//	ClienteListarPaginadoService clienteListarPaginadoService; 
//	
//	@BeforeEach
//	void setUp() {
//		MockitoAnnotations.openMocks(this);
//	}
//	
//	@Test
//	void testBuscaPaginado() {
//		var cliente = new ClienteListarPaginadoEntity();
//		Pageable pageable = PageRequest.of(0, 10);
//		cliente.setCpf("teste");
//		cliente.setNome("nome");
//		var listaCliente = List.of(cliente);
//		Page<ClienteListarPaginadoEntity> pageableReturn = new PageImpl<>(listaCliente, pageable, 10);
//		
//		when(clienteListarPaginadoPort.listar(any(), anyInt())).thenReturn(pageableReturn);
//		
//		PaginacaoEntity resultado = clienteListarPaginadoService.buscar(pageable, Integer.valueOf(0));
//		Assertions.assertEquals(listaCliente, resultado.getData());
//		
//		
//	}
//
//}
package br.com.crudsrvhexa.domain.service;


