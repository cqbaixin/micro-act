package com.haitao.pb.service.repository;

import com.haitao.pb.service.model.elasticsearch.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface UserRepository extends ElasticsearchRepository<User ,String> {
    @Override
    List<User>findAll();

    Page<User>findByAge(int age, Pageable pageable);

}
