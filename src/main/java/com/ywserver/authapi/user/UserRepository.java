package com.ywserver.authapi.user;

import com.ywserver.authapi.user.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("""
           SELECT u.id, u.name, u.email
           FROM User u
           WHERE u.token = :token
               AND u.isDelete = False
    """)
    UserDto findUserByToken(@Param("token") String token);

}