package priv.jihua.struts2.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 自定义拦截器，继承抽象类
 * @author 焦计划
 * @date 2019年7月7日  上午8:46:25
 */
public class MyInterceptor2 extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		//1.执行Action之前的工作
		long startTime = System.currentTimeMillis();
		System.out.println("执行Action动作之前的工作，开始时间："+startTime);
		//2.执行后续拦截器或Action
		String result = invocation.invoke();
		
		//3.执行Action之后的操作
		long endTime = System.currentTimeMillis();
		long execTime = endTime - startTime;
		System.out.println("执行Action之后的工作，结束时间："+endTime+",挂靠耗时："+execTime+ "ms");
		//返回结果字符串
		return result;
		
	}

}
