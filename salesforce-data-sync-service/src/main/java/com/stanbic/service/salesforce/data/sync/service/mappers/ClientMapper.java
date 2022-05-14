package com.stanbic.service.salesforce.data.sync.service.mappers;

import com.stanbic.service.salesforce.data.sync.service.DTOs.Client;
import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleClient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientMapper MAPPER = Mappers.getMapper(ClientMapper.class);

    Client getClient(LocalFinacleClient localFinacleClient);

    List<Client> getClients(List<LocalFinacleClient> localFinacleClientList);
}
