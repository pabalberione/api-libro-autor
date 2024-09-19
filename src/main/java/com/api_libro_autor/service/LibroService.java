package com.api_libro_autor.service;

import com.api_libro_autor.model.Autor;
import com.api_libro_autor.model.Libros;
import com.api_libro_autor.repositories.IAutorRepository;
import com.api_libro_autor.repositories.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    ILibroRepository iLibroRepository;

    @Autowired
    IAutorRepository iAutorRepository;

    public List<Libros>getAllBooks(){
        return iLibroRepository.findAll();
    }

    public Optional<Libros> getBookById(Long id){
        return iLibroRepository.findById(id);
    }

    public Libros saveBook(Libros libro, Long authorId){
        //Buscar el autor del libro por id
        Autor autor = iAutorRepository.findById(authorId).orElseThrow(()->new RuntimeException("Autor no encontrado"));
        //Asignar el autor al libro
        libro.setAutor(autor);
        return iLibroRepository.save(libro);
    }

    public void deleteBook(Long id){
        iLibroRepository.deleteById(id);
    }
}
