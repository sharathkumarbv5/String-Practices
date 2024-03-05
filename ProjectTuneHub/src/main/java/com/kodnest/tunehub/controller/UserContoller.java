package com.kodnest.tunehub.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.kodnest.tunehub.entity.Song;
import com.kodnest.tunehub.entity.User;
import com.kodnest.tunehub.service.SongService;
import com.kodnest.tunehub.serviceimpl.UserServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserContoller {
	@Autowired
	UserServiceImpl serviceimpl;
	@Autowired
	SongService songService;
	@PostMapping("/register")
	public String addUser(@ModelAttribute User user) {
		//email take from registration from
		String email=user.getEmail();
		//checking if email as 
		//		entered in registration from is present in db or not
		boolean status=serviceimpl.emailExists(email);
		if(status==false) {
			serviceimpl.addUser(user);
			System.out.println("User Added");
		}else {
			System.out.println("User Already exists");
		}
		return "login";

	}
	@PostMapping("/validate")
	public String validate(@RequestParam("email") String email,
			@RequestParam("password")String password,HttpSession 
			session,Model model) {
		if(serviceimpl.validateUser(email,password)==true) {
			String role=serviceimpl.getRole(email);
			session.setAttribute("email", email);
			if(role.equals("admin")) {
				return "adminhome";	
			}else {
				User user = serviceimpl.getUser(email);
				boolean userstatus = user.isIspremium();
				List<Song> songList = songService.fetchAllSongs();
				model.addAttribute("songs", songList);
				model.addAttribute("ispremium", userstatus);
				return "customerhome";

			}
		}else {
			return "login";
		}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	@GetMapping("/exploresongs")
	public String exploresongs(String email) {
		return email;


	}
}