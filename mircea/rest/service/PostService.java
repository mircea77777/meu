package com.softvision.mircea.rest.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.softvision.mircea.dto.PostDTO;
import com.softvision.mircea.dto.UserDTO;

public interface PostService {

	public Optional<PostDTO> addPost(UserDTO userDTO, PostDTO postDTO);
	
	public List<PostDTO> getOwnPosts(UserDTO userDTO, Date date);
	
	public List<PostDTO> getFeed(UserDTO userDTO);
}