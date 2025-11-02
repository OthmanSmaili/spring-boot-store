package com.othmansmaili.store.mappers;

import com.othmansmaili.store.dtos.CartDto;
import com.othmansmaili.store.dtos.CartItemDto;
import com.othmansmaili.store.entities.Cart;
import com.othmansmaili.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
