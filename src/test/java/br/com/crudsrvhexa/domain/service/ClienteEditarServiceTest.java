//package br.com.crudhexa.domain.service;
//
//import static org.mockito.ArgumentMatchers.any;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import br.com.crudhexa.domain.common.VerificarDadosCommon;
//import br.com.crudhexa.domain.entity.ClienteIdEntity;
//import br.com.crudhexa.port.output.ClienteEditarPort;
//
//class ClienteEditarServiceTest {
//	
//	@Mock
//	private VerificarDadosCommon verificarDadosCommon;
//	
//	@Mock
//	private ClienteEditarPort clienteEditarPort;
//	
//	@InjectMocks
//	private ClienteEditarService clienteEditarService;
//
//	@BeforeEach
//	void setUp() {
//		MockitoAnnotations.openMocks(this);
//	}
//	
//	@Test
//	void testEditarClienteComSucesso() {
//		Long codigo = 1L;
//		String nome = "Teste Nome";
//		String novoCpf = "3333333";
//		ClienteIdEntity clienteIdEntity = new ClienteIdEntity(codigo, nome, novoCpf);
//		
//		//when(verificarDadosCommon.verificarIdExistente(codigo, clienteEditarPort.getClienteRepository())).thenReturn(true);
//		when(clienteEditarPort.editar(any(ClienteIdEntity.class))).thenReturn(clienteIdEntity);
//	
//		ClienteIdEntity resultado = clienteEditarService.editar(codigo, nome, novoCpf);
//	
//		assertEquals(clienteIdEntity, resultado);
//		verify(clienteEditarPort).editar(any(ClienteIdEntity.class));
//		
//	}
//	
//	
//
//
//}
//
//
package br.com.crudsrvhexa.domain.service;


