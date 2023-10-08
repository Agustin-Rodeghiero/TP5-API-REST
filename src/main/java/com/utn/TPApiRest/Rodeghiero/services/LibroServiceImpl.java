package com.utn.TPApiRest.Rodeghiero.services;

import com.utn.TPApiRest.Rodeghiero.entities.Libro;
import com.utn.TPApiRest.Rodeghiero.repositories.BaseRepository;
import com.utn.TPApiRest.Rodeghiero.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{
    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
