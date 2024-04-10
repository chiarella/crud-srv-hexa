//package br.com.crudhexa.domain.service;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import br.com.crudhexa.domain.entity.ClienteEntity;
//import br.com.crudhexa.port.output.ClienteSalvarPort;
//
//
//class ClienteCriarServiceTest {
//	
//	@Test
//	void testCriarCliente() {
//		
//		ClienteSalvarPort clienteSalvarPort = Mockito.mock(ClienteSalvarPort.class);
//		ClienteCriarService criarClienteService = new ClienteCriarService(clienteSalvarPort);
//		
//		ClienteEntity clienteEntity = ClienteEntity.builder().build();
//		
//		Mockito.when(clienteSalvarPort.salvarCliente(clienteEntity)).thenReturn(clienteEntity);
//		
//		ClienteEntity resultado = criarClienteService.criarCliente(clienteEntity);
//		
//		assertEquals(clienteEntity, resultado);
//		
//	}
//	
////	@Test
////	void testCriarClienteDataConflictException() {
////		
////		ClienteSalvarPort clienteSalvarPort = Mockito.mock(ClienteSalvarPort.class);
////		CriarClienteService criarClienteService = new CriarClienteService(clienteSalvarPort);
////		
////		ClienteEntity clienteEntity = ClienteEntity.builder().build();
////
////		assertThrows(DataConflictException.class, () -> criarClienteService.criarCliente(clienteEntity));
////		
////	}
//
//}
package br.com.crudsrvhexa.domain.service;


