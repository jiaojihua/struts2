package priv.jihua.struts2.web.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private String userName;
	private String password;
	private String nextDispose;//下一个跳转的action
	private Date currentTime;
	
	
	
	public Date getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}
	public String getNextDispose() {
		return nextDispose;
	}
	public void setNextDispose(String nextDispose) {
		this.nextDispose = nextDispose;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		return super.SUCCESS;
	}
	
	public String login() {
		//获取session作用域对象
		Map<String, Object> session = ActionContext.getContext().getSession();
		//获取原始response对象
		HttpServletResponse response = ServletActionContext.getResponse();
		System.out.println(userName);
		System.out.println(password);
		if(null == userName ||"".equals(userName)) {
			this.addFieldError("userName", "用户名不能为空（业务方法）");
		}
		if(null == password || "".equals(password)) {
			this.addFieldError("password", "密码不能为空（业务方法）");
		}
		if(this.hasErrors()) {
			this.addActionError("用户名或密码错误！");
			return this.INPUT;
		}
		if(userName.equals("common")&&password.equals("common")) {
			nextDispose = "common";
			session.put("user", nextDispose);
			return super.SUCCESS;
		}else if(userName.equals("admin")&&password.equals("admin")) {
			nextDispose = "admin";
			session.put("user", nextDispose);
			setCurrentTime(new Date());
			session.put("time", currentTime);
			return super.SUCCESS;
		}else {
			return super.INPUT;
		}
		
		
	}
	
	public String adminLogin() {
		currentTime = new Date();
		return super.SUCCESS;
	}
	
	public String commonLogin() {
		if(null == userName ||"".equals(userName)) {
			this.addFieldError("userName", "用户名不能为空（业务方法）");
		}
		if(null == password || "".equals(password)) {
			this.addFieldError("password", "密码不能为空（业务方法）");
		}
		if(this.hasErrors()) {
			this.addActionError("用户名或密码错误！");
			return this.INPUT;
		}
		return super.SUCCESS;
	}
	//调用所有方法时都会先通过这个验证
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(null == userName ||"".equals(userName)) {
			this.addFieldError("userName", "用户名不能为空（业务方法）");
		}
		if(null == password || "".equals(password)) {
			this.addFieldError("password", "密码不能为空（业务方法）");
		}
		if(this.hasErrors()) {
			this.addActionError("用户名或密码错误！");
		}
	}
	
	//验证单个方法
	public void validateLogin() {
		if(null == userName ||"".equals(userName)) {
			this.addFieldError("userName", "用户名不能为空（业务方法）");
		}
		if(null == password || "".equals(password)) {
			this.addFieldError("password", "密码不能为空（业务方法）");
		}
		if(this.hasErrors()) {
			this.addActionError("用户名或密码错误！");
		}
	}
	
	
	
	
	

}
