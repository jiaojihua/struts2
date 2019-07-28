package priv.jihua.struts2.web.action;

import com.opensymphony.xwork2.ActionSupport;

import priv.jihua.struts2.entity.User;

public class UserAction2 extends ActionSupport {
	private User user;
	

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.SUCCESS;
	}

}
