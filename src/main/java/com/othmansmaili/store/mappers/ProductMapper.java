package com.othmansmaili.store.mappers;

import com.othmansmaili.store.dtos.ProductDto;
import com.othmansmaili.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);
}
