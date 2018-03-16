package com.techelevator.ssg.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class ForumController {
	@Autowired
	private ForumDao forumPosts;

	@RequestMapping(path = "/spaceForum", method = RequestMethod.GET)
	public String showSpaceForum(ModelMap modelMap) {
		modelMap.put("forumPosts", forumPosts.getAllPosts());

		return "spaceForum";
	}

	@RequestMapping(path = "/spaceForumPost", method = RequestMethod.GET)
	public String showSpaceForumPost() {
		return "spaceForumPost";
	}

	@RequestMapping(path = "/spaceForumPost", method = RequestMethod.POST)
	public String showSpaceForumPost(@RequestParam String username, @RequestParam String subject,
			@RequestParam String message) {
		LocalDateTime datePosted = LocalDateTime.now();
		ForumPost post = new ForumPost();
		post.setUsername(username);
		post.setSubject(subject);
		post.setMessage(message);
		post.setDatePosted(datePosted);
		forumPosts.save(post);

		return "redirect:/spaceForum";
	}
	
	@RequestMapping(path="/spaceGeekTrivia", method=RequestMethod.GET)
	public String showSpaceGeekTrivia() {
		
		return "spaceGeekTrivia";
	}

	@RequestMapping(path="/spaceGeekTrivia", method=RequestMethod.POST)
	public String showSpaceGeekTrivia(@RequestParam String username, @RequestParam Integer answer) {
		
		if(answer == 1 ) {
		return "redirect:/spaceGeekTriviaRight";
		} else
		return "redirect:/spaceGeekTriviaWrong";
	}
	@RequestMapping(path="/spaceGeekTriviaRight", method=RequestMethod.GET)
	public String showSpaceGeekTriviaRight() {
		
		return "spaceGeekTriviaRight";
	}
	
	@RequestMapping(path="/spaceGeekTriviaWrong", method=RequestMethod.GET)
	public String showSpaceGeekTriviaWrong() {
		
		return "spaceGeekTriviaWrong";
	}
	
}
