package br.com.crudsrvhexa.adapter.mapper;

import org.mapstruct.Mapper;

import br.com.crudsrvhexa.adapter.input.response.PaginacaoResponse;
import br.com.crudsrvhexa.domain.entity.PaginacaoEntity;

@Mapper(componentModel = "spring")
public interface PaginacaoMapper {

	PaginacaoResponse toEntity(PaginacaoEntity paginacaoEntity);
	
}
