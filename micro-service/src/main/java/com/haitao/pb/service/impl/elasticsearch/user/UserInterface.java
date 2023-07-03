package com.haitao.pb.service.impl.elasticsearch.user;


import com.haitao.pb.service.model.elasticsearch.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface UserInterface {

    public User save(User user);

    public List<User>findAll();

    public User findById(String id);

}
