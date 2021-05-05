package com.yangfei.springbootdemo.dto;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public  class User  implements BeanFactoryPostProcessor , BeanNameAware
, BeanClassLoaderAware, InitializingBean, DisposableBean,BeanPostProcessor {
    private String name;
    private String age;
    private ClassLoader classLoader;

    public String getName()  {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ClassLoader getClassLoader() {
        return classLoader;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public User() {
        System.out.println("构造器执行");
    }


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor.postProcessBeanFactory执行");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor.postProcessBeforeInitialization执行:"+beanName);

        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor.postProcessAfterInitialization执行:"+beanName);

        return bean;
    }

    @Override
    public void setBeanName(String name) {
        setName(name);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        setClassLoader(classLoader);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy执行");
        String str ;
        System.out.println("23432");
        System.out.println("2343");
    }
}
