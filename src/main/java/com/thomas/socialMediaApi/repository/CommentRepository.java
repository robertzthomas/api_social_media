package com.thomas.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.thomas.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
