package uk.ac.belfastmet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.service.TodoService;


@Controller
@RequestMapping
public class TodoController 
{
	
	Logger log = LoggerFactory.getLogger(TodoController.class);
	
	/**
	 * method to direct to the index page which adds data for the table on that page
	 * @param model
	 * @return an index html file
	 */
	@GetMapping("/index")
	public String homePage(Model model)
	{
		log.info("inside homePage Method");
		
		model.addAttribute("pagetitle", "ToDotdotdsfsfa");
		
		TodoService todoService = new TodoService();
		model.addAttribute("todo", todoService.getTodo());
		
		log.info("leaving homePage Method");
		return "index";
	}
}
