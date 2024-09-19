package com.api_libro_autor.repositories;

import com.api_libro_autor.model.Autor;
import com.api_libro_autor.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibroRepository extends JpaRepository<Libros, Long> {

    void sabeBook(Libros libro, Long autorId);
}
