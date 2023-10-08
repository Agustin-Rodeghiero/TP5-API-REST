package com.utn.TPApiRest.Rodeghiero.services;

import com.utn.TPApiRest.Rodeghiero.entities.Persona;
import com.utn.TPApiRest.Rodeghiero.repositories.BaseRepository;
import com.utn.TPApiRest.Rodeghiero.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}


