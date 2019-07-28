package priv.jihua.struts2.web.action;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

public class DataAction extends ActionSupport {
	private String name;
	private int age;
	private String wife;
	private String data;
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWife() {
		return wife;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}
	
	public String show() {
		System.out.println(name);
		String name = "李四";
		JSONObject jsonObj = JSONObject.fromObject(name);
		String jsonStr = jsonObj.toString();
		data = jsonStr;
		
		return SUCCESS;
	}
}
