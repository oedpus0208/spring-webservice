package com.oedpus.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oedpus.domain.posts.PostsMainResponseDto;
import com.oedpus.domain.posts.PostsRepository;
import com.oedpus.domain.posts.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostsService {
	private PostsRepository postsRepository;
	
	@Transactional
	public long save(PostsSaveRequestDto dto) {
		return postsRepository.save(dto.toEntity()).getId();
	}
	
	@Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
