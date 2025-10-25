package com.othmansmaili.store.repositories;

import com.othmansmaili.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}