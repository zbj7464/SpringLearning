package sub.spring.aop.test;


import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AopMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
//		UserService service = (UserService) ctx.getBean("userService");
		DriverManagerDataSource dataSource = (DriverManagerDataSource) ctx.getBean("dataSource");
		JdbcTemplate template = new JdbcTemplate(dataSource);
		String sql = "select * from user_tables";
		List<Map<String, Object>> maps = template.queryForList(sql);
		for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
//		service.add();
		
	}
}
