package com.card.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.card.model.card;

@RestController
public class cardController {

	@Autowired
	private KieSession session;
	
	@PostMapping("/card")
	public card orderNow(@RequestBody card card) {
		session.insert(card);
		session.fireAllRules();
		return card;
	}
}
