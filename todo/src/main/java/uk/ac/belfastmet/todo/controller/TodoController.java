package uk.ac.belfastmet.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.todo.service.TodoService;


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
		
		model.addAttribute("pagetitle", "To-Do");
		
		TodoService todoService = new TodoService();
		model.addAttribute("todo", todoService.getTodo());
		
		log.info("leaving homePage Method");
		return "index";
	}
	
	/**
	 * this method directs to the completed page which filters the tasks by completion status
	 * 
	 * @param model
	 * @return the 'completed' html page
	 */
	@GetMapping("/completed")
	public String completedPage(Model model)
	{
		log.info("inside completedPage method");
		
		model.addAttribute("pagetitle","Completed");
		
		TodoService todoService = new TodoService();
		model.addAttribute("todo", todoService.getTodo());
		
		return "completed";
	}
	
	
	@GetMapping("/login")
	public String loginPage(Model model)
	{
		return "login";
	}
}
