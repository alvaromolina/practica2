package com.ucbcba.taller.repositories;


import com.ucbcba.taller.entities.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AutorRepository extends CrudRepository<Autor, Integer> {

}