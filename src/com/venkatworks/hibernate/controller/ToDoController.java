package com.venkatworks.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.venkatworks.hibernate.dao.ToDoDAO;
import com.venkatworks.hibernate.entity.ToDo;
import com.venkatworks.hibernate.service.TodoService;

@Controller
@RequestMapping("/todo")
public class ToDoController {

	@Autowired
	private TodoService todoService;
	
	@GetMapping("/list")
	public String listToDos(Model theModel) {
		
		List<ToDo> todoList = todoService.getToDoList();
		theModel.addAttribute("todos", todoList);
		
		return "list-todos";
	}
	
	@GetMapping("/showFormForAdd")
	public String ShowFormForAdd(Model theModel) {
		
		ToDo toDo = new ToDo();
		theModel.addAttribute("todo", toDo);
		
		return "todo-form";
	}
	
	@PostMapping("/saveToDo")
	public String SaveToDo(@ModelAttribute("todo") ToDo thetodo) {
		
		todoService.SaveToDo(thetodo);
		return "redirect:/todo/list";
		
	}
}
