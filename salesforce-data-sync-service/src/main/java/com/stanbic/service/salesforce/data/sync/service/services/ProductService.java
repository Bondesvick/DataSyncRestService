package com.stanbic.service.salesforce.data.sync.service.services;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleProduct;
import com.stanbic.service.salesforce.data.sync.service.exceptions.DataSyncException;
import com.stanbic.service.salesforce.data.sync.service.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final Logger log = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository productRepository;

    public List<LocalFinacleProduct> getByFrequency(Integer frequency)  throws DataSyncException {

        try {
            log.info("fetching " + frequency + "products");

            Integer toTake = frequency;

            if (frequency > 100){
                toTake =  100;
            }

            Pageable pageable = PageRequest.of(0, toTake, Sort.by("id").ascending());

            return productRepository.findByPushResponseStatus("PENDING",pageable);
        }catch (Exception e){

            log.error(e.getMessage(),e);

            throw new DataSyncException(e.getMessage());

        }
    }

    public void save(LocalFinacleProduct localFinacleProduct) throws DataSyncException{
        try {
            log.info("Saving product detail to data base");
            productRepository.save(localFinacleProduct);

        } catch (Exception e){
            log.error("Error saving product detail to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }

    public void saveAll(List<LocalFinacleProduct> localFinacleProductList) throws DataSyncException{
        try {
            log.info("Saving product list details to data base");
            productRepository.saveAll(localFinacleProductList);

        } catch (Exception e){
            log.error("Error saving product list details to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }
}
