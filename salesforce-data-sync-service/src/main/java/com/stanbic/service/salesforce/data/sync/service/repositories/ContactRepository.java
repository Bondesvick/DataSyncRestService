package com.stanbic.service.salesforce.data.sync.service.repositories;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleContact;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<LocalFinacleContact, String> {

    List<LocalFinacleContact> findByPushResponseStatus(String pushResponseStatus, Pageable pageable);

    List<LocalFinacleContact> findByPushResponseStatusAndClientSalesforceIdNotNull(String pushResponseStatus,
                                                                                   Pageable pageable);

    List<LocalFinacleContact> findByPushResponseStatusAndClientCif(String pushResponseStatus, String clientCif,
                                                                   Pageable pageable);

    List<LocalFinacleContact> findByPushResponseStatusAndClientCifIsNull(String pushResponseStatus, Pageable pageable);
}
