package test;

import java.util.Locale;

/**
 * 
 * @author 焦计划
 * @date 2019年7月7日  上午7:48:00
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale [] locales =Locale.getAvailableLocales();
			for(Locale l :locales) {
				//返回该语言环境的国家或地区名及代码
				System.out.println(l.getDisplayCountry()+" "+ l.getCountry());
				//返回该语言环境的语言名称及代码
				System.out.println(l.getDisplayLanguage()+" "+ l.getLanguage());
			}
	}

}
