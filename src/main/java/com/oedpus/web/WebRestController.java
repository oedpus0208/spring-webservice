package com.oedpus.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@RequestMapping("/")
	public String hello() {
		System.out.println("UPDATE!!");
		return "Hello World!!!!";
	}
}
