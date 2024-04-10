//package br.com.crudhexa.domain.service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.anyLong;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import br.com.crudhexa.domain.entity.ClienteEntity;
//import br.com.crudhexa.domain.entity.ClienteIdEntity;
//import br.com.crudhexa.port.output.ClienteBuscaPorIdPort;
//import br.com.crudhexa.port.output.ClienteExcluirPort;
//
//
//
//@ExtendWith(MockitoExtension.class)
//class ClienteExcluirServiceTest {
//	
//	@Mock
//	private ClienteBuscaPorIdPort clienteBuscaPorIdPort;
//	
//	@Mock 
//	private ClienteExcluirPort clienteExcluirPort;
//	
//	@InjectMocks
//	private ClienteExcluirService clienteExcluirService;
//	
//	@Test
//	void testExcluirClienteComSucesso() {
//		
//		ClienteIdEntity clienteEntity = new ClienteIdEntity();
//		
//		when(clienteBuscaPorIdPort.buscar(anyLong())).thenReturn(clienteEntity);
//		when(clienteExcluirPort.excluir(anyLong())).thenReturn("TESTE - Exlluido com sucesso");
//		
//		String resultado = clienteExcluirService.excluir(1L);
//		
//		assertEquals("TESTE - Exlluido com sucesso", resultado);
//	}
//	
////	@Test
////	void testExcluirClienteNaoEncontrado() {
////		
////		when(clienteExcluirPort.excluir(anyLong())).thenReturn(null);
////		
////		assertThrows(NotFoundException.class, () -> clienteExcluirService.excluir(1L));
////	}
//
//}
package br.com.crudsrvhexa.domain.service;


