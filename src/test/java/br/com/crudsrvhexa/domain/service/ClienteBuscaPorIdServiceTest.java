//package br.com.crudsrvhexa.domain.service;
//
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import br.com.crudhexa.adapter.mapper.ClienteMapper;
//import br.com.crudhexa.domain.common.VerificarDadosCommon;
//import br.com.crudhexa.domain.entity.ClienteIdEntity;
//import br.com.crudhexa.port.output.ClienteBuscaPorIdPort;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//class ClienteBuscaPorIdServiceTest {
//	
//	@Mock
//	private ClienteBuscaPorIdPort clienteBuscaPorIdPort;
//	
//	@Mock
//	private ClienteMapper clienteMapper;
//	
//	@Mock
//	private VerificarDadosCommon verificarDadosCommon;
//	
//	@InjectMocks
//	private ClienteBuscaPorIdService clienteBuscaPorIdService;
//	
//	@BeforeEach
//	void setUp() {
//		MockitoAnnotations.openMocks(this);
//	}
//	
//	@Test
//	void testBuscaClientePorIdSucesso() {
//		Long codigoCliente = 1L;
//		
//		ClienteIdEntity clienteEsperado = new ClienteIdEntity(codigoCliente, "teste", "teste");
//		
////		when(verificarDadosCommon.verificarIdExistente(codigoCliente, clienteBuscaPorIdPort.getClienteRepository()))
////			.thenReturn(true);
//		when(clienteBuscaPorIdPort.buscar(codigoCliente)).thenReturn(clienteEsperado);
//		
//		ClienteIdEntity resultado = clienteBuscaPorIdService.buscar(codigoCliente);
//		
//		assertEquals(clienteEsperado, resultado);
//		
//	}
//}
package br.com.crudsrvhexa.domain.service;


