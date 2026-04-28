package Project.ALMXN.Controllers;

import Project.ALMXN.Services.UsuarioService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/gestion/adminUsuarios")
public class UsuarioController {

    private final UsuarioService UsuarioService;

    public UsuarioController(UsuarioService UsuarioService) {
        this.UsuarioService = UsuarioService;
    }

    @GetMapping("")
    public String mostrarAdminUsuarios(Model model){
        model.addAttribute("listaUsuarios", UsuarioService.obtenerTodosLosUsuarios());
        model.addAttribute("paginaActiva", "gestion");
        return "gestion/adminUsuarios";
    }

}
