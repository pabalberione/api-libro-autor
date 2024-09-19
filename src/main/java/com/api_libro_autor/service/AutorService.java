package com.api_libro_autor.service;

import com.api_libro_autor.model.Autor;
import com.api_libro_autor.repositories.IAutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    IAutorRepository iAutorRepository;

    public List<Autor> getAllAuthors(){
        return iAutorRepository.findAll();
    }

    public Autor createAuthor(Autor autor){
        //Asignar el autor a cada libro antes de guardar
        if(autor.getLibros()!=null){
            autor.getLibros().forEach(libro -> libro.setAutor(autor));
        }
        return iAutorRepository.save(autor);
    }

    public void deleteAuthor(Long id){
        iAutorRepository.deleteById(id);
    }
}
