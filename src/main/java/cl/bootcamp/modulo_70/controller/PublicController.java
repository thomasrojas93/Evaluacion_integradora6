package cl.bootcamp.modulo_70.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PublicController {

	@GetMapping("/public")
	public String publicGet() {
		
	System.out.println(new BCryptPasswordEncoder().encode("1234"));
		return "public.jsp";
	}
}
