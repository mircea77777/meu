package com.softvision.mircea.repositories;

import com.softvision.mircea.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private Set<User> users = new HashSet<>();

	public Set<User> getUsers() {
		return users;
	}
	
    // custom methods
    @Override
    public Optional<User> findByUserName(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> findByFirstName(String firstName) {
        for (User user : users) {
            if (user.getFirstName().equals(firstName)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> findByLastName(String lastName) {
        for (User user : users) {
            if (user.getLastName().equals(lastName)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> findLoginUser(String userName, String password) {
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getUserName().equals(password)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }


    // CRUD methods - to be deleted when integrated a database
    @Override
    public <S extends User> S save(S s) {
        users.add(s);
        return s;
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return users;
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> iterable) {
        return users;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> iterable) {

    }

    @Override
    public void deleteAll() {

    }

	@Override
	public User follow(User follower, User following) {
		follower.addUserToFollow(following);
		//follower.getUsersWhomHeFollows().add(following);
		return following;
	}


	
	
}
