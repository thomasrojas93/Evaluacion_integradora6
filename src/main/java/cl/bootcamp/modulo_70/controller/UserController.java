package cl.bootcamp.modulo_70.controller;


import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.modulo_70.model.Usuario;
import cl.bootcamp.modulo_70.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UserController {
	
	private final UsuarioService usuarioService;
	
	public UserController(UsuarioService usuarioService) {
		this.usuarioService=usuarioService;
	}
	
	
	@GetMapping("/listado")
	public ModelAndView listadoGet() {	
		
		ModelAndView mav= new ModelAndView("usuario/usuario-listado.jsp");
		List<Usuario> list= usuarioService.listado();
		mav.addObject("list",list);
		
		return mav;
	}
	
		
}
