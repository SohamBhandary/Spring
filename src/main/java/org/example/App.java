package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        Alien a = (Alien) context.getBean("alien1");
////        a.code();
//        a.age=21;
//        System.out.println(a.age);
//        Alien a2 = (Alien) context.getBean("alien1");
////        a.code();
//
//        System.out.println(a2.age);
        Alien a = (Alien) context.getBean("alien1");
//        a.setAge(21);
        System.out.println(a.getAge());






    }
}
