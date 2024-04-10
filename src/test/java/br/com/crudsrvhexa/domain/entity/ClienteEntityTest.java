package br.com.crudsrvhexa.domain.entity;

import org.junit.jupiter.api.Test;

import br.com.crudsrvhexa.domain.entity.ClienteEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteEntityTest {
	
	@Test
	void testGetSetCpf() {
		ClienteEntity clienteEntity = new ClienteEntity();
		clienteEntity.setCpf("320");
		assertEquals("320", clienteEntity.getCpf());
	}
	
	@Test
	void testGetSetNome() {
		ClienteEntity clienteEntity = new ClienteEntity();
		clienteEntity.setNome("Anderson");
		assertEquals("Anderson", clienteEntity.getNome());
	}

}
