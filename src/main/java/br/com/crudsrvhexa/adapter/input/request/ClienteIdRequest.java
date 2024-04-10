package br.com.crudsrvhexa.adapter.input.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClienteIdRequest {
	
	private Long codigoCliente;
	@NotNull(message = "O campo nao pode ser nulo e deve ser um campo de texto")
	@Size(min = 3, max = 100, message = "o campo deve ter no minimo 3 e maximo 100 caracteres")
	private String nome;
	private String cpf;
	
	public ClienteIdRequest(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

}
