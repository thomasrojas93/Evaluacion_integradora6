package cl.bootcamp.modulo_70.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.modulo_70.model.Usuario;
import cl.bootcamp.modulo_70.service.UsuarioService;

@Controller
public class LoginController {

    private final UsuarioService usuarioService;

    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/login")
    public String login(Model model, @RequestParam(name="error", required = false) String error) {
        model.addAttribute("error", error);
        return "login.jsp";
    }

    @GetMapping("/form")
    public ModelAndView formGet(@RequestParam(defaultValue="false") boolean creado) {        
        ModelAndView mav = new ModelAndView("usuario/usuario-form.jsp");
        mav.addObject("creado", creado);
        return mav;
    }

    @PostMapping("/form")
    public String formPost(@ModelAttribute Usuario usuario) {
        int id = usuarioService.crear(usuario);
        int resultado = (id > 0) ? 1 : 0;
        return "redirect:/form?creado=" + resultado;
    }
}
