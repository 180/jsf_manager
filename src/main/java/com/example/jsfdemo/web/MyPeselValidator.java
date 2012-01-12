package com.example.jsfdemo.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
 
@ManagedBean(name="mpv")
@SessionScoped
public class MyPeselValidator{
 
	public String textbox1;
	public String textbox2;
 
	//getter and setter methods
 
	public void validateTextBox(ComponentSystemEvent event){
 
		FacesContext fc = FacesContext.getCurrentInstance();
 
		UIComponent components = event.getComponent();
 
		//get textbox1 value
		UIInput uiText1 = (UIInput)components.findComponent("yob");
		String text1 = uiText1.getLocalValue().toString().substring(2, 4);
 
		//get textbox2 value
		UIInput uiText2 = (UIInput)components.findComponent("pesel");
		String text2 = uiText2.getLocalValue().toString().substring(0, 2);
 
		if(!(text1.equals(text2))){
 
			FacesMessage msg = 
			  new FacesMessage("Bledna data urodzenia lub pesel");
 
                        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
 
			//components.getClientId() = textPanel
			fc.addMessage(components.getClientId(), msg);
 
			//passed to the Render Response phase
			fc.renderResponse();
		}
 
	}
}
