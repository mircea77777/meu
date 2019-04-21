package com.softvision.mircea.repositories;

import com.softvision.mircea.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public Set<User> getUsers();
	
    Optional<User> findByUserName(String userName);

    Optional<User> findByFirstName(String firstName);

    Optional<User> findByLastName(String lastName);

    Optional<User> findLoginUser(String userName, String password);

    User follow(User follower, User following);

}
