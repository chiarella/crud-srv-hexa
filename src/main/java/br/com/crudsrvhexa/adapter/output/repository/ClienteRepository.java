package br.com.crudsrvhexa.adapter.output.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.crudsrvhexa.adapter.output.data.ClienteJpa;

public interface ClienteRepository extends JpaRepository<ClienteJpa, Long>{

//SQL SERVER	
//	@Query(value = """
//			SELECT * FROM tb_cliente t
//			WHERE 1=1
//			AND t.cod = ISNULL(:codigoCliente, t.cod)
//			""", nativeQuery = true)
//	public Page<ClienteJpa> filtrar(Pageable pageable, Integer codigoCliente);
	
	@Query(value = """
		    SELECT * FROM tb_cliente t
		    WHERE 1=1
		    AND t.cod = COALESCE(:codigoCliente, t.cod)
		    """, nativeQuery = true)
	public Page<ClienteJpa> filtrar(Pageable pageable, Integer codigoCliente);

}
