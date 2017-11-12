package com.venkatworks.hibernate.dao;

import java.util.List;

import com.venkatworks.hibernate.entity.ToDo;

public interface ToDoDAO {
	
	public List<ToDo> getToDoList();

	public  void SaveToDo(ToDo todo);

	public void DeleteToDo(ToDo todo);

	public void UpdateToDo(ToDo todo);

}
