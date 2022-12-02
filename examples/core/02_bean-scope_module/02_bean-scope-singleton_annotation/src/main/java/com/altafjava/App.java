package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.altafjava.bean.MyBean;

@ComponentScan
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
		MyBean myBean1 = applicationContext.getBean(MyBean.class);
		MyBean myBean2 = (MyBean) applicationContext.getBean("myBean");
		System.out.println("Bean1 Hashcode: " + myBean1.hashCode());
		System.out.println("Bean2 Hashcode: " + myBean2.hashCode());
		System.out.println("are both beans same: " + (myBean1 == myBean2));
	}
}