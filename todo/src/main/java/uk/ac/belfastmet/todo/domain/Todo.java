package uk.ac.belfastmet.todo.domain;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Todo 
{
	private Boolean status;
	private String priority;
	private String name;
	private String description;
	private Date deadline;
	private Date dateCreated;
	private String owner;
	
	
	
	Logger log = LoggerFactory.getLogger(Todo.class);

	
	//constructor
	public Todo(Boolean status, String priority, String name, 
				String description, Date deadline, Date dateCreated,
				String owner) 
	{
		log.info("Enter Todo constructor");
		
		this.status = status;
		this.priority = priority;
		this.name = name;
		this.description = description;
		this.deadline = deadline;
		this.dateCreated = dateCreated;
		this.owner = owner;
		
		log.info("Leave Todo constructor");
	}
	
	//getters and setters
	public Boolean getStatus() 
	{
		return status;
	}
	
	public void setStatus(Boolean status) 
	{
		this.status = status;
	}
	
	public String getPriority() 
	{
		return priority;
	}
	
	public void setPriority(String priority) 
	{
		this.priority = priority;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public Date getDeadline() 
	{
		return deadline;
	}
	
	public void setDeadline(Date deadline) 
	{
		this.deadline = deadline;
	}
	
	public Date getDateCreated() 
	{
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated) 
	{
		this.dateCreated = dateCreated;
	}
	
	public String getOwner() 
	{
		return owner;
	}
	
	public void setOwner(String owner) 
	{
		this.owner = owner;
	}
	
	
}
