package com.stanbic.service.salesforce.data.sync.service.mappers;

import com.stanbic.service.salesforce.data.sync.service.DTOs.Product;
import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleProduct;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    Product getProduct(LocalFinacleProduct localFinacleProduct);

    List<Product> getProducts(List<LocalFinacleProduct> localFinacleProductList);
}
