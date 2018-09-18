package com.questcomputing.quest;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.questcomputing.quest.dao.UserDaoServices;
import com.questcomputing.quest.entity.User;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log =
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	@Autowired
	UserDaoServices userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		/*User user = new User("43434aaa", "Jeferson", Calendar.getInstance().getTime(), "0833650789");
		//userDaoService.insert(user);
		long insert = user.getId();
		log.info("New user is created " + user);*/
	}

}
