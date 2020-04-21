package sub.spring.aop.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	
	public void add(){
		System.out.println("UserService add ...");
	}
	
	public void update(){
		System.out.println("UserService update ...");
	}
}
