package com.stanbic.service.salesforce.data.sync.service.repositories;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleClient;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<LocalFinacleClient, String> {
//    List<LocalFinacleClient> findBy
    List<LocalFinacleClient> findByPushResponseStatus(String pushResponseStatus, Pageable pageable);
}
