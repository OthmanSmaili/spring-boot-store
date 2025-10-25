package com.othmansmaili.store.repositories;

import com.othmansmaili.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
