package com.opensam.example.withdynamo.service;

import com.opensam.example.withdynamo.dao.ContactDao;
import com.opensam.example.withdynamo.dataformat.Comment;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class ContactService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ContactDao contactDao;

    public URI createComment(Comment comment) {
        validateComment(comment);
        LOGGER.debug("Inserting comment from : "+comment.getEmail());
        contactDao.createComment(comment);
        return URI.create(comment.getEmail());
    }

    // TODO : Validate email with a regex pattern
    private void validateComment(Comment comment) {
        if(comment == null){
            throw new IllegalArgumentException("Invalid comment received");
        } else if(StringUtils.isBlank(comment.getName())){
            throw new IllegalArgumentException("Blank Name received");
        } else if(StringUtils.isBlank(comment.getEmail())){
            throw new IllegalArgumentException("Blank email received");
        } else if(StringUtils.isBlank(comment.getMessage())){
            throw new IllegalArgumentException("Blank Message received");
        }
    }
}
