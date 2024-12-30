package com.marketplace.realdeal.products.interfaces;

import com.marketplace.realdeal.products.Product;
import com.marketplace.realdeal.products.dto.ProductToCreateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface ProductMapper {
  @Mapping(target = "id", ignore = true)
  Product productToCreateToProduct(ProductToCreateDto productToCreateDto);
}
