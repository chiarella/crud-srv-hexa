package br.com.crudsrvhexa.port.input;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommonTestUseCase {

	<T, I> boolean idExists(I id, JpaRepository<T, I> repository);
	
}
