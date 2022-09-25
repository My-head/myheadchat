package com.myheadchat.user;

import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface  UserRepository extends JpaRepository<User, Long> {


    User findByUsername(String username);

    Page<User> findByUsernameNot(String username, Pageable page);


}
