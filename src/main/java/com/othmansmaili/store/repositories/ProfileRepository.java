package com.othmansmaili.store.repositories;

import com.othmansmaili.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}