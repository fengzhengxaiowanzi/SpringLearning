package com.zhang.test;

import com.zhang.model.Person;
import com.zhang.model.PersonLife;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * @author: zhangxinjun
 * @description: com.zhang.test
 * @date：Created in 11:46 2021/8/21
 */
public class XmlTest {
    public static void xmlTest(){
        //xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        Person person = (Person) context.getBean("Person");
        System.err.println(person);
    }
    public static void groovyTest(){
        //groovy文件
        ApplicationContext context1 = new GenericGroovyApplicationContext("Application.groovy");
        Person person = context1.getBean("Person",Person.class);
        System.err.println(person);
    }
    public static void commTest(){
        //通用上下文对象
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("Application.xml");
        //不能忘记
        context.refresh();
        PersonLife person = (PersonLife) context.getBean("PersonLife");
        System.err.println(person);
    }
    public static void main(String[] args) {
        commTest();
    }
}
