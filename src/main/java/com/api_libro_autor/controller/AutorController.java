package com.api_libro_autor.controller;

import com.api_libro_autor.model.Autor;
import com.api_libro_autor.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor>obtenerAutores(){
        return autorService.getAllAuthors();
    }

    @PostMapping
    public Autor crearAutor(@RequestBody Autor autor){
        return autorService.createAuthor(autor);
    }

    @DeleteMapping("/{id}")
    public void eliminarAutor(@PathVariable Long id){
        autorService.deleteAuthor(id);
    }
}
