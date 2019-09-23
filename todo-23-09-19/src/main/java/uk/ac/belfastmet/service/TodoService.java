package uk.ac.belfastmet.service;

import java.util.ArrayList;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.domain.Todo;

@Service
public class TodoService 
{
	
	private ArrayList<Todo> todo;
	
	
	Logger log = LoggerFactory.getLogger(TodoService.class);

	
	public ArrayList<Todo> getTodo()
	{
		log.info("Enter getTodo");
		this.todo = new ArrayList<Todo>();
		
		//				  Todo(status, priority,name, description, deadline, dateCreated, owner)
		this.todo.add(new Todo(true, "1","Matthew's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Matthew"));
		this.todo.add(new Todo(false,"2","Josh's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Josh"));
		this.todo.add(new Todo(true, "3","Rose's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Rose"));
		this.todo.add(new Todo(true, "4","Hannah's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Hannah"));
		this.todo.add(new Todo(false,"5","Paul's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Paul"));
		this.todo.add(new Todo(true, "6","Jack's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Jack"));
		
		log.info("leaving getTodo");
		return this.todo;
	}
	
	@SuppressWarnings("deprecation")
	public Date setDate(int year, int month, int day)
	{	
		Date date = new Date(year, month, day);
		
		return date;
	}
}
