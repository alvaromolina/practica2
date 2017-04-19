package com.ucbcba.taller.repositories;

import com.ucbcba.taller.entities.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by alvaro on 19/4/17.
 */

@Transactional
public interface CommentRepository extends CrudRepository<Comment, Integer> {

}