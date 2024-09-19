package com.api_libro_autor.controller;

import com.api_libro_autor.model.Libros;
import com.api_libro_autor.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    LibroService libroService;

    @GetMapping
    public List<Libros>getAllBooks(){
        return libroService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Libros>getBookByid(@PathVariable Long id){
        return libroService.getBookById(id);
    }

    @PostMapping
    public Libros createBook(@RequestBody Libros libro, @RequestParam Long autorId){
        return libroService.saveBook(libro, autorId);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id, @RequestBody Libros libros){
        libroService.deleteBook(id);
    }
}
