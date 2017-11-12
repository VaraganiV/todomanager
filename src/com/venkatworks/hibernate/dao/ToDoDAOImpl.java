package com.venkatworks.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.venkatworks.hibernate.entity.ToDo;
import org.hibernate.query.Query;


@Repository
public class ToDoDAOImpl implements ToDoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<ToDo> getToDoList() {

		// current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create query
		Query<ToDo> theQuery = currentSession.createQuery("from ToDo", ToDo.class);

		// result set
		List<ToDo> todos = theQuery.getResultList();
		
		return todos;
	}


	@Override
	public void SaveToDo(ToDo todo) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(todo);
	}


	@Override
	public void DeleteToDo(ToDo todo) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.delete(todo);
	}


	@Override
	public void UpdateToDo(ToDo todo) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(todo);
	}

}
