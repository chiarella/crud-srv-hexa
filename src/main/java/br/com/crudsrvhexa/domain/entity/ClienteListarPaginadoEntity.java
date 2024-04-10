package br.com.crudsrvhexa.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ClienteListarPaginadoEntity {
	
	private Long codigoCliente;
	private String nome;
	private String cpf;

}

