package com.wakshum.repository;

import com.wakshum.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
