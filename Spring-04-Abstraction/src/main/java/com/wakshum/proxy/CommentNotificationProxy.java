package com.wakshum.proxy;

import com.wakshum.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
