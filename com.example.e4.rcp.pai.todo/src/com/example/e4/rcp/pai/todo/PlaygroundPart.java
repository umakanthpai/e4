package com.example.e4.rcp.pai.todo;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.example.e4.rcp.pai.bundleresourceloader.IBundleResourceLoader;

public class PlaygroundPart {

	@PostConstruct
	public void createControls(Composite parent, IBundleResourceLoader loader){
		System.out.println(this.getClass().getSimpleName() + "@PostConstruct method called.");
		Label label = new Label(parent, SWT.None);
		label.setImage(loader.loadImage(this.getClass(), "images/refresh.gif"));
	}
	
	@Focus
	private void setFocus(){
		System.out.println(this.getClass().getSimpleName() + " @Focus method called");
	}
}
