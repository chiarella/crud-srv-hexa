package br.com.crudsrvhexa.domain.exception;

public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = 8784227920716300318L;
	public NotFoundException(String message) {
		super(message);
	}
}
