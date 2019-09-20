package uk.ac.belfastmet.TopTenMusic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.TopTenMusic.service.TopTenService;

@Controller
@RequestMapping
public class TopTenController 
{
	
	Logger log = LoggerFactory.getLogger(TopTenController.class);

	
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
		log.info("An info Message");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("topArtists",topTenService.getTopArtists());
		
		return "artist";
	}
}
