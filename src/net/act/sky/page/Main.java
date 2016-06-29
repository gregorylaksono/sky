package net.act.sky.page;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

import net.act.sky.StyleUtil;

public class Main extends VerticalLayout {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7271939508827808308L;

	public Main(){
		createContents();
	}

	private void createContents() {
		MarginInfo m = new MarginInfo(false, false, true, false);
		setMargin(m);
		addStyleName(StyleUtil.MAIN);
		setSizeFull();
		setSpacing(true);
		
		VerticalLayout header = new VerticalLayout();
		header.addStyleName(StyleUtil.MAIN_HEADER);
		header.setWidth(100, Unit.PERCENTAGE);
		header.setHeight(130, Unit.PIXELS);
		
		VerticalLayout content = new VerticalLayout();
		content.addStyleName(StyleUtil.COLOR_TRANSPARENT);
		content.addStyleName(StyleUtil.CONTENT_ROOT);
		
		content.setHeight(90, Unit.PERCENTAGE);
		content.setWidth(90, Unit.PERCENTAGE);
		
		addComponent(header);
		addComponent(content);
		
		setExpandRatio(header, 0.0f);
		setExpandRatio(content, 1.0f);
		setComponentAlignment(content, Alignment.MIDDLE_CENTER);
		
	}
	
	
}
