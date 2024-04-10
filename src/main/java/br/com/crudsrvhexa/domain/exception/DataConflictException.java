package br.com.crudsrvhexa.domain.exception;

public class DataConflictException extends RuntimeException {
	private static final long serialVersionUID = -642321570855123419L;
	public DataConflictException(String message) {
		super(message);
	}
}
