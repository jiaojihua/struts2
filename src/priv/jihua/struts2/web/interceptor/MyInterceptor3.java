package priv.jihua.struts2.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
/**
 * 自定义拦截器，继承类，只拦截Action部分方法时用
 * @author 焦计划
 * @date 2019年7月7日  上午8:47:31
 */
public class MyInterceptor3 extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
