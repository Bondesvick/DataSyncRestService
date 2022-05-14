package com.stanbic.service.salesforce.data.sync.service.mappers;

import com.stanbic.service.salesforce.data.sync.service.DTOs.Relationship;
import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleRelationship;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RelationshipMapper {
    RelationshipMapper MAPPER = Mappers.getMapper(RelationshipMapper.class);

    Relationship getRelationship(LocalFinacleRelationship localFinacleRelationship);

    List<Relationship> getRelationships(List<LocalFinacleRelationship> localFinacleRelationshipList);
}
