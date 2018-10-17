package com.mexico.web.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemCtrl {
	@Autowired Item item;
	@Autowired ItemMapper itemMapper;
	
	public void add() {
		
	}
}
