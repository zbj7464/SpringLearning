package sub;

import org.junit.Test;

public class Demo {
	
	@Test
	public void demo() throws Exception{
		UserDao userDao = new UserDao();

        UserDao factory = (UserDao) new ProxyFactory(userDao).getProxyInstance();
        System.out.println(factory.getClass());
        factory.save();
	} 
}
