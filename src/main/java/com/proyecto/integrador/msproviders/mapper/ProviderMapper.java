package com.proyecto.integrador.msproviders.mapper;

import com.proyecto.integrador.msproviders.dto.ProviderDto;
import com.proyecto.integrador.msproviders.model.Provider;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProviderMapper extends EntityMapper<ProviderDto, Provider>{
}

