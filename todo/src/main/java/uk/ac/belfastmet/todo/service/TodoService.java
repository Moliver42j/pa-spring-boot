package uk.ac.belfastmet.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.core.InteractionCallback;
import org.springframework.stereotype.Service;


import uk.ac.belfastmet.todo.domain.Todo;

/**
 * 
 * @author oli19171901
 *
 */
@Service
public class TodoService 
{
	
	@Autowired
	private uk.ac.belfastmet.todo.repositories.TodoRepository todoRepository;

	
	private ArrayList<Todo> todo;
	
	
	Logger log = LoggerFactory.getLogger(TodoService.class);

	/**
	 * this method populates the 'todo' ArrayList
	 * 
	 * @return the todo ArrayList
	 */
	public Iterable<Todo> getTodo()
	{
		log.info("Enter getTodo");
		//this.todo = new ArrayList<Todo>();
		
		/*
		//				  Todo(status, priority,name, description, deadline, dateCreated, owner)
		this.todo.add(new Todo(true, "1","Matthew's task","deliver award winning ted talk",setDate(2019,10,04),setDate(2019,9,23),"Matthew"));
		this.todo.add(new Todo(false,"2","Josh's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Josh"));
		this.todo.add(new Todo(true, "3","Rose's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Rose"));
		this.todo.add(new Todo(true, "4","Hannah's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Hannah"));
		this.todo.add(new Todo(false,"5","Paul's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Paul"));
		this.todo.add(new Todo(true, "6","Jack's task","a task",setDate(2019,10,04),setDate(2019,9,23),"Jack"));
		*/
		
		Iterable< Todo > todo = todoRepository.findAll();
		Iterator< Todo > iterator = todo.iterator();
		
		while(iterator.hasNext())
		{
			log.info("{}", iterator.next().toString());
			log.info("Thank you, next");
		}
		
		log.info("leaving getTodo");
		return todo;
	}
	
	/**
	 * this method sets the date variable for the 'todo' ArrayList
	 * @param year
	 * @param month
	 * @param day
	 * @return date
	 */
	@SuppressWarnings("deprecation")
	public Date setDate(int year, int month, int day)
	{	
		Date date = new Date(year, month, day);
		
		return date;
	}
	
	
	/**
	 * gets the number of items in the todo object
	 */
	public void getNumberOfTasks()
	{
		log.info("# of tasks: {}", todoRepository.count());
		log.info("other: {}", todoRepository.findAll());
	}
}
