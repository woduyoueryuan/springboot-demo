package com.yangfei.springbootdemo;

import com.yangfei.springbootdemo.dto.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
         // SpringApplication.run(SpringbootDemoApplication.class, args);
        ApplicationContext ac = new  ClassPathXmlApplicationContext("classpath:application.xml");
        User user = (User) ac.getBean("user");

    }

}
