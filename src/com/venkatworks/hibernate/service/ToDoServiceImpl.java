package com.venkatworks.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.venkatworks.hibernate.dao.ToDoDAO;
import com.venkatworks.hibernate.entity.ToDo;


@Service
public class ToDoServiceImpl implements TodoService {

	@Autowired
	ToDoDAO todoDAO;
	
	@Override
	@Transactional
	public List<ToDo> getToDoList() {
		return todoDAO.getToDoList();
	}

	@Override
	@Transactional
	public void SaveToDo(ToDo todo) {
		 todoDAO.SaveToDo(todo);
	}

	@Override
	public void DeleteToDo(ToDo todo) {
		todoDAO.DeleteToDo(todo);
		
	}

	@Override
	public void UpdateToDo(ToDo todo) {
		todoDAO.UpdateToDo(todo);
	}

}
