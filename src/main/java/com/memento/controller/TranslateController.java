package com.memento.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.memento.service.TranslateService;

@RestController
@RequestMapping("/translate/*")
public class TranslateController {

	@Autowired
	private TranslateService translateService;
	
	@PostMapping("/papago")
	public String main(@RequestBody Map<String, Object> param) {
		System.out.println("파람 :" + param);
		String text = (String) param.get("text");
		return TranslateService.main(text);
	}
}
