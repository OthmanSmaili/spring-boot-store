package com.othmansmaili.store.repositories;

import com.othmansmaili.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}