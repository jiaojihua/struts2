package priv.jihua.struts2.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.addActionMessage(getText("welcome",new String[] {"admin"}));
		return super.SUCCESS;
	}
	
	public String hello() {
		return "hello";
	}
	
	public String hi() {
		return "hi";
	}

}
