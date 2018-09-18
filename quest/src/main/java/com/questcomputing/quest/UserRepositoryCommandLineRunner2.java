package com.questcomputing.quest;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.questcomputing.quest.dao.UserRepository;
import com.questcomputing.quest.entity.User;

@Component
public class UserRepositoryCommandLineRunner2 implements CommandLineRunner {

	private static final Logger log =
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner2.class);
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("43434bbb", "Roberto", Calendar.getInstance().getTime(), "0833650789");
		//userRepository.save(user);
		
		Optional<User> userOne = userRepository.findById(1L);
		
		log.info("User is retieved " + userOne.get());
		
		List<User> users = userRepository.findAll();
		
		log.info("All users " + users);
	}

}
