package com.stanbic.service.salesforce.data.sync.service.repositories;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalSalesforceUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<LocalSalesforceUser, String> {
}
