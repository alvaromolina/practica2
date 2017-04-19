package com.ucbcba.taller.repositories;


import com.ucbcba.taller.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}