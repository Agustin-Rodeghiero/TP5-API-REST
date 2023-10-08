package com.utn.TPApiRest.Rodeghiero.repositories;

import com.utn.TPApiRest.Rodeghiero.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
