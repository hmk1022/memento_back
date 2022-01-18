package com.memento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.memento.service.TranslateService;

@RestController
@RequestMapping("/translate")
public class TranslateController {

	@Autowired
	private TranslateService translateService;
	
	@GetMapping("/papago")
	public String main() {
		return translateService.main(null);
	}
}
