package com.questcomputing.quest.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.questcomputing.quest.dao.UserRepository;

//@RestController
@Controller
public class UserResource {
	/*@Autowired
	private UserDaoServices service;*/
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(method=RequestMethod.GET, path="greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
	
	/*//GET
	//retrieveAllUsers
	@RequestMapping(method=RequestMethod.GET, path="users")
	public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}*/
	
	//GET
	//retrieveAllUsers
	@RequestMapping(method=RequestMethod.GET, path="users")
	public String retrieveAllUsers(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "users";
	}
	
	//GET
	//retrieveUser
	@RequestMapping(method=RequestMethod.GET, path="user")
	public String userForm(Model model) {
		model.addAttribute("user", new User());
	    return "user";		
	}
	
	@RequestMapping(method=RequestMethod.POST, path="user")
    public String userSubmit(@ModelAttribute User user) {
		
		//User user1 = new User(user.getPpsNumber(), user.getName(), user.getBirthDay(), user.getMobilePhone());
		try {
			userRepository.save(user);
	        return "result";
		} catch (Exception e) {
			return "error";
		}
		
    }

	/*//GET
	//retrieveUser
	@RequestMapping(method=RequestMethod.GET, path="users/{id}")
	public User retrieveUser(@PathVariable Long id) {
		Optional<User> user = userRepository.findById(id);
		if(user == null) 
			throw new UserNotFoundException("id - " + id);
		return user.get(); 
	}*/
	
	//DELETE
	//retrieveUser
	@RequestMapping(method=RequestMethod.DELETE, path="users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
	}
}
