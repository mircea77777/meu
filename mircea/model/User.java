package com.softvision.mircea.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;
//import javax.persistence.Id;

@Entity
public class User {

    @Id
    private long id;
    
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    
    @OneToMany
    private Set<User> usersWhomHeFollows = new HashSet<>();
    @OneToMany
    private Set<Post> posts = new HashSet<>();

    // hibernate cand ia un user din baza de date lucreaza cu constructorul asta, de accea trebuie definit
    // hibernate ca sa initializeze atributele are nevoie de setteri
    public User() {
    }

    // idul il genereaza baza de date
    public User(long id, String userName, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
	
    public Set<User> getUsersWhomHeFollows() {
		return usersWhomHeFollows;
	}

	public void setUsersWhomHeFollows(Set<User> usersWhomHeFollows) {
		this.usersWhomHeFollows = usersWhomHeFollows;
	}

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public void addUserToFollow(User userToFollow) {
    	usersWhomHeFollows.add(userToFollow);
    }
    
    public void addPost(Post post) {
    	posts.add(post);
    }


    
    
}
