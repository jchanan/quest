package com.questcomputing.quest.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.questcomputing.quest.entity.User;

	
@Repository
@Transactional
public class UserDaoServices {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		entityManager.persist(user);
		
		return user.getId();
	}
	
	
/*private static List<User> users = new ArrayList<>();
	
private static String randomPpsN = "4647447aa";
	
	static {
		users.add(new User("", "Mark", new Date(), "089 365 0795"));
		users.add(new User("", "Paul", new Date(), "089 365 0795"));
		users.add(new User("", "OConner", new Date(), "089 365 0795"));
		users.add(new User("", "Steve", new Date(), "089 365 0795"));
		users.add(new User("", "Jhon", new Date(), "089 365 0795"));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if (user.getPpsNumber() == null) {
			user.setPpsNumber(randomPpsN);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(String ppsNumber) {
		for (User user : users) {
			if(user.getPpsNumber().equals(ppsNumber)) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteByPpsNumber(String ppsNumber) {
		
		Iterator<User> iterator = users.iterator();
		
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getPpsNumber() == ppsNumber) {
				iterator.remove();
				return user;
			}
		}
		for (User user : users) {
			if(user.getPpsNumber() == ppsNumber) {
				return user;
			}
		}
		return null;
	}*/
}
