package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.Comment;

/**
 * Created by alvaro on 19/4/17.
 */
public interface CommentService {

    Iterable<Comment> listAllComments();

    Comment getCommentById(Integer id);

    Comment saveComment(Comment comment);

    void deleteComment(Integer id);
}
