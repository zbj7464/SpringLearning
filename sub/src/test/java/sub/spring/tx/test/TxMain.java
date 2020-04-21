package sub.spring.tx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sub.spring.tx.service.AccountService;

public class TxMain {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-tx.xml");
		AccountService  accountService = (AccountService) ctx.getBean("accountService");
		accountService.transfer("aaa", "bbb", 200d);
	}
}
