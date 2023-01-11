package com.example.springbootjparest.RestController;

import com.example.springbootjparest.Entity.Colegio;
import com.example.springbootjparest.Repository.ColegioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ColegioController {
    private final ColegioRepository colrepo;

    public ColegioController(ColegioRepository colrepo) {
        this.colrepo = colrepo;
    }

    @GetMapping("/colegios")
    List<Colegio> all() {
        return colrepo.findAll();
    }
    @PostMapping("/colegios")
    Colegio colegio(@RequestBody Colegio colegio) {
        return colrepo.save(colegio);
    }

    @PutMapping("/colegios/{id}")
    Colegio updatecolegio(@RequestBody Colegio colegio , @PathVariable int id){
        Colegio c = colrepo.findById(id).orElseThrow();
        c.setColor(colegio.getColor());
        c.setDireccion(colegio.getDireccion());
        return colrepo.save(c);
    }


}
