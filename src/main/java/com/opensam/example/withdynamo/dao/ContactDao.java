package com.opensam.example.withdynamo.dao;

import com.opensam.example.withdynamo.dataformat.Comment;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ContactDao {

    private Map<String, Comment> contactRepo = null;

    public ContactDao() {
        contactRepo = new HashMap<String, Comment>();
    }


    public void createComment(Comment comment) {
        contactRepo.put(comment.getEmail(), comment);
    }
}
