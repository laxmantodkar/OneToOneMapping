package com.jpa.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.support.Repositories;

@SpringBootApplication(scanBasePackages = "com.jpa")
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//================================================
//	 User user=new User();
//	 user.setName("laxman");
//	 user.setCity("Pune");
//	 
//	 User user1=new User();
//	 user1.setName("Akshata");
//	 user1.setCity("Sangli");
//	 
//	 User user2=new User();
//	 user2.setName("Lata");
//	 user2.setCity("Mumbai");

//=================================================	 
		// save single object
		// User user1 = userRepository.save(user);
		// System.out.println(user1);
//=====================================================	 
		// save multiple object
		/*
		 * List<User> list=new ArrayList<>(); list.add(user); list.add(user1);
		 * list.add(user2); Iterable<User> userList = userRepository.saveAll(list);
		 * userList.forEach(u->//u is variable name { System.out.println(u); });
		 */
//=======================================================	

		// update
//	 Optional<User> user = userRepository.findById(2);
//	 User user = user.get();
//	 user.setName("Laxman Todkar");
//	 System.out.println(user);
//===================================================
		// fetch data
//		Iterable<User> user = userRepository.findAll();
//		user.forEach(var -> {
//			System.out.println(var);
//		});
//=================================================

		//System.out.println(userRepository.findByName("Laxman"));
		//System.out.println(userRepository.getAllUser());
		//System.out.println(userRepository.getUserByName("Laxman",2));
		//System.out.println(userRepository.getLength(3));
		//System.out.println(userRepository.getAllUser());
		
        userRepository.deleteById(2);
		
	}

}
