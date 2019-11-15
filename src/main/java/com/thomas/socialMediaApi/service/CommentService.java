package com.thomas.socialMediaApi.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomas.socialMediaApi.entity.Comment;
import com.thomas.socialMediaApi.entity.Post;
import com.thomas.socialMediaApi.entity.User;
import com.thomas.socialMediaApi.repository.PostRepository;
import com.thomas.socialMediaApi.repository.UserRepository;
import com.thomas.socialMediaApi.repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	private CommentRepository repo;
	
	@Autowired
	private PostRepository postRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public Comment createComment(Comment comment, Long userId, Long postId) throws Exception{
		User user = userRepo.findOne(userId);
		Post post = postRepo.findOne(postId);
		if(user == null || post == null) {
			throw new Exception("user or Post does not exist.");
		}
		//comment.setDate(new Date());
		comment.setUser(user);
		comment.setPost(post);
		return repo.save(comment);
	}
	
	public void deleteComment(Long commentId) {
		repo.delete(commentId);
	}
}
