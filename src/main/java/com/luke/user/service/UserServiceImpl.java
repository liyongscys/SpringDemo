package com.luke.user.service;

import com.luke.user.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostConstruct
    public void init() {
        logger.info("init {}", this.getClass().getName());
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<User>(4);

        return users;
    }
}
