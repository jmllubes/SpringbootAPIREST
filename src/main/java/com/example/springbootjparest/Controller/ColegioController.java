/*package com.example.springbootjparest.Controller;

import com.example.springbootjparest.Entity.Colegio;
import com.example.springbootjparest.Repository.ColegioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ColegioController {
    private final ColegioRepository colrepo;

    public ColegioController(ColegioRepository colrepo) {
        this.colrepo = colrepo;
    }
    @GetMapping("/colegios")
    List<Colegio> all(){
    return colrepo.findAll();
    }


}
*/