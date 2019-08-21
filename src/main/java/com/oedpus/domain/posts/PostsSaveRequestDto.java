package com.oedpus.domain.posts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {
	private String title;
	private String content;
	private String author;
	
	public Posts toEntity() {
		return Posts.builder()
				.author(author)
				.title(title)
				.content(content)
				.build();
	}
	
}
