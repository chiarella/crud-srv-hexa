package br.com.crudsrvhexa.port.output;

//import org.springframework.data.jpa.repository.JpaRepository;
//import br.com.crudhexa.adapter.output.data.ClienteJpa;

public interface ClienteExcluirPort {
	
	//JpaRepository<ClienteJpa, Long> getClienteRepository(); 
	String excluir(Long codigoCliente);

}
