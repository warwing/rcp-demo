package de.jardas.rcp.module1.client.ui;


import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

import de.jardas.rcp.module1.client.pub.Module1ServiceFactory;

public class SampleView extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().applyTo(container);
		
		Label label = new Label(container, SWT.NONE);
		label.setText("Hallo Welt");
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).applyTo(label);
		
		Button button = new Button(container, SWT.NONE);
		button.setText("Ask service");
		button.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(Module1ServiceFactory.getModule1Service().getInfo());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				System.out.println(Module1ServiceFactory.getModule1Service().getInfo());
			}
		});
	}

	@Override
	public void setFocus() {

	}

}
