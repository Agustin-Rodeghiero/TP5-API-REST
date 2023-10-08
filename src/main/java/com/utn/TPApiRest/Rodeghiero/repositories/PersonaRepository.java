package com.utn.TPApiRest.Rodeghiero.repositories;

import com.utn.TPApiRest.Rodeghiero.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
