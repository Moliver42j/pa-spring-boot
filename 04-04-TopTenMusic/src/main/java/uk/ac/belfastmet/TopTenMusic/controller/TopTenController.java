package uk.ac.belfastmet.TopTenMusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TopTenController 
{
	@GetMapping("/index")
	public String homePage(Model model)
	{
		return "index";
	}
	
	@GetMapping("/song")
	public String topTensongs(Model model)
	{
		return "song";
	}
	
	@GetMapping("/artist")
	public String topTenArtists(Model model)
	{
		return "artist";
	}
}
