package com.haitao.pb.service.impl.elasticsearch.user;


import com.haitao.pb.service.model.elasticsearch.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface UserInterface {

    User save(User user);

    List<User>findAll();

    User findById(String id);

    Page<User> findByAge(int age, Pageable pageable);
}
