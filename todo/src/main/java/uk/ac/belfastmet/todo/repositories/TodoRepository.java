package uk.ac.belfastmet.todo.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.todo.domain.Todo;;
/** 
 * @author oli19171901
 */

/**
 * establishes connection to the CrudRepository. Deals with SQL Queries and connections
 *  auto-magically
 */
@Repository
public interface TodoRepository  extends CrudRepository<Todo, Long>
{
	
}
