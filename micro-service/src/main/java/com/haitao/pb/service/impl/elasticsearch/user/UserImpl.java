package com.haitao.pb.service.impl.elasticsearch.user;

import com.haitao.pb.service.model.elasticsearch.User;
import com.haitao.pb.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class UserImpl implements UserInterface{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Page<User>findByAge(int age, Pageable pageable){
        return userRepository.findByAge(age,pageable);
    }

}
