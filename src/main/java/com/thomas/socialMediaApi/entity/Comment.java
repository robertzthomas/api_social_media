package com.thomas.socialMediaApi.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fasterxml.jackson.annotation.JsonIgnore;
import com.thomas.socialMediaApi.entity.Post;
import com.thomas.socialMediaApi.entity.User;

@Entity
public class Comment {

		private Long id;
		private String content;
		private Date date;
		private User user;
		
		@JsonIgnore
		private Post post;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		
		public String getContent() {
			return content;
		}
		
		public void setContent(String content) {
			this.content = content;
		}
		
		public Date getDate() {
			return date;
		}
		
		public void setDate(Date date) {
			this.date = date;
		}
		
		@manyToOne
		@JoinColumn(name = "postId")
		public Post getPost() {
			return post;
		}
		
		public void setPost(Post post) {
			this.post = post;
		}
		
		@ManyToOne
		@joinColumn(name = "userId")
		public User getUser() {
			return user;
		}
		
		public void setUser(User user) {
			this.user = user;
		}
}
