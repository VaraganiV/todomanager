package com.venkatworks.hibernate.service;

import java.util.List;

import com.venkatworks.hibernate.entity.ToDo;

public interface TodoService {
	
	public List<ToDo> getToDoList();
	public void SaveToDo(ToDo todo);
	public void DeleteToDo(ToDo todo);
	public void UpdateToDo(ToDo todo);
}
