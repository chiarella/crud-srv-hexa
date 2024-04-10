package br.com.crudsrvhexa.adapter.mapper;

import org.mapstruct.Mapper;

import br.com.crudsrvhexa.adapter.input.request.ClienteIdRequest;
import br.com.crudsrvhexa.adapter.input.request.ClienteRequest;
import br.com.crudsrvhexa.adapter.input.response.ClienteIdResponse;
import br.com.crudsrvhexa.adapter.input.response.ClienteResponse;
import br.com.crudsrvhexa.adapter.output.data.ClienteJpa;
import br.com.crudsrvhexa.domain.entity.ClienteEntity;
import br.com.crudsrvhexa.domain.entity.ClienteIdEntity;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

	ClienteEntity toEntity(ClienteRequest clienteRequest);

	ClienteResponse toClienteResponse(ClienteEntity clienteEntity);

	ClienteJpa toClienteMapper(ClienteEntity clienteEntity);

	ClienteEntity toClienteEntity(ClienteJpa cliente);

	ClienteEntity toEntityId(ClienteIdRequest clienteIdRequest);
	
	ClienteIdResponse toClienteIdResponse(ClienteIdEntity cliente);

	ClienteIdEntity toClienteIdEntity(ClienteJpa cliente);

	ClienteJpa toClienteIdJpa(ClienteIdEntity clienteIdEntity);


}
