package com.example.springbootjparest.WebController;

import com.example.springbootjparest.Entity.Colegio;
import com.example.springbootjparest.Repository.ColegioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ColegioWebController {

    private final ColegioRepository colrepo;

    public ColegioWebController(ColegioRepository colrepo) {
        this.colrepo = colrepo;
    }

    @GetMapping("/mostrarcolegios")
    public String mostrar(Model model) {
        List<Colegio> llista = colrepo.findAll();
        model.addAttribute("llista", llista);
        return "mostrar";
    }

    @GetMapping("/insertarcolegios")
    public String insertar(Model model) {
        model.addAttribute("Colegio", new Colegio());
        return "insertar";
    }

    @PostMapping("/insertarcol")
    public String insert(Colegio colegio,Model model) {
        colrepo.save(colegio);
        return "redirect:/mostrarcolegios";
    }

}
