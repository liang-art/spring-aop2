package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService= (AccountService)context.getBean("accountService");
       // accountService.save();
        System.out.println("==================");
        accountService.update("hello");


    }
}
