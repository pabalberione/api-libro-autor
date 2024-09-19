package com.api_libro_autor.repositories;

import com.api_libro_autor.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutorRepository extends JpaRepository<Autor, Long> {
}
