package com.stanbic.service.salesforce.data.sync.service.repositories;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleRelationship;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationshipRepository extends JpaRepository<LocalFinacleRelationship, String> {

    List<LocalFinacleRelationship> findByPushResponseStatus(String pushResponseStatus, Pageable pageable);

    List<LocalFinacleRelationship> findByPushResponseStatusAndClientSalesforceIdNotNullAndContactSalesforceIdNotNull(
            String pushResponseStatus, Pageable pageable);
}
