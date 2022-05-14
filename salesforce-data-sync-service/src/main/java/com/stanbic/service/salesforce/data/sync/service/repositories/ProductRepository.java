package com.stanbic.service.salesforce.data.sync.service.repositories;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleProduct;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<LocalFinacleProduct, String> {

    List<LocalFinacleProduct> findByPushResponseStatus(String pushResponseStatus, Pageable pageable);

    List<LocalFinacleProduct> findByPushResponseStatusAndClientSalesforceIdNotNull(String pushResponseStatus,
                                                                                   Pageable pageable);
}
