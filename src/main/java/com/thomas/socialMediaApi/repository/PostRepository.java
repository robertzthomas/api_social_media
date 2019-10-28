package com.thomas.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.thomas.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
