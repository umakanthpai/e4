package com.example.e4.rcp.pai.todo;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.widgets.Composite;

import com.example.e4.rcp.pai.todo.model.ITodoService;

public class TodoOverviewPart {

	@PostConstruct
	public void createControls(Composite parent, ITodoService todoService){
		System.out.println("Dependency Injection: " + todoService.getTodos().size());
	}
	
	@Focus
	private void setFocus(){
		System.out.println(this.getClass().getSimpleName() + " @Focus method called");
	}
}
