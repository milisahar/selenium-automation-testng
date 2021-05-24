package com.todos.tests;

import java.io.IOException;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;
//import com.todos.utils.Setup;
//import com.todos.utils.Setup;

public class RemoveTodo extends Setup{
	public RemoveTodo() throws IOException {
		super();
	}
	TodoPage todoPage;
	@Test(priority = 2)
	public void iCanDeleteTodo() throws IOException, InterruptedException {
		todoPage = new TodoPage();
		todoPage.destroyTodo(prop.getProperty("todo1"));
		
	}
	
}
