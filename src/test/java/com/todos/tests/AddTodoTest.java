package com.todos.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
	}
	TodoPage todoPage;
	@Test(priority = 1)
	public void iCanAddTodo() throws IOException {
		todoPage = new TodoPage();
		boolean elementText = todoPage.isElementDisplayed(TodoPage.inputField);
		Assert.assertTrue(elementText);
		todoPage.submitTodo(prop.getProperty("todo1"));
		String elementTodo = todoPage.checkElementContains(TodoPage.element1);
		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo1")));
		boolean checkbox = todoPage.isCheckboxSelected(TodoPage.checkbox);
		Assert.assertFalse(checkbox);
	}
	
}
