package com.example.e4.rcp.pai.todo;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.widgets.Composite;

public class TodoDetailsPart {
	@PostConstruct
	public void createControls(Composite parent){
		System.out.println(parent.getLayout().getClass());
		System.out.println(this.getClass().getSimpleName() + "@PostConstruct method called.");
	}
	
	@Focus
	private void setFocus(){
		System.out.println(this.getClass().getSimpleName() + " @Focus method called");
	}
}
