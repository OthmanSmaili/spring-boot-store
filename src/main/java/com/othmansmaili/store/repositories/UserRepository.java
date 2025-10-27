package com.othmansmaili.store.repositories;

import com.othmansmaili.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
