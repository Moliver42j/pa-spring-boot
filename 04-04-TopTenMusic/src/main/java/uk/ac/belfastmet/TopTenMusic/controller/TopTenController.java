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
	
	/**
	 * This method is getting the index for the application by catching
	 * url that is entered into the search bar
	 * 
	 * @param model
	 * @return an index html file
	 */
	@GetMapping("/index")
	public String homePage(Model model)
	{
		log.info("index method");
		
		return "index";
	}
	
	/**
	 * This method is getting the 'song' page for the application by catching
	 * url that is entered into the search bar
	 * 
	 * @param model
	 * @return song html file
	 */
	@GetMapping("/song")
	public String topTensongs(Model model)
	{
		log.info("song method");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("topSongs",topTenService.getTopSongs());
		
		return "song";
	}
	
	/**
	 * This method is getting the 'artist' page for the application by catching
	 * url that is entered into the search bar
	 * 
	 * @param model
	 * @return artist html file
	 */
	@GetMapping("/artist")
	public String topTenArtists(Model model)
	{
		log.info("artist method");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("topArtists",topTenService.getTopArtists());
		
		return "artist";
	}
}
