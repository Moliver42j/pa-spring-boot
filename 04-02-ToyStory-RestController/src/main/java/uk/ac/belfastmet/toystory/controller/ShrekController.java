package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ShrekController 
{
	
	@GetMapping("/shrek")
	public String shrek()
	{
		return "Shrek was play by Mike Myers";
	}
	
	@GetMapping("/donkey")
	public String donkey()
	{
		return "Donkey was played by Eddie Murphy";
	}
	
}
