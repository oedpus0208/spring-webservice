package com.oedpus.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oedpus.domain.posts.PostsRepository;
import com.oedpus.domain.posts.PostsSaveRequestDto;
import com.oedpus.service.PostsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	//private PostsRepository repository;
	private PostsService service;

	@RequestMapping("/")
	public String hello() {
		System.out.println("UPDATE!!");
		return "Hello World!!!!";
	}
	
	@RequestMapping("/posts")
	public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
		return service.save(dto);
	}
}
