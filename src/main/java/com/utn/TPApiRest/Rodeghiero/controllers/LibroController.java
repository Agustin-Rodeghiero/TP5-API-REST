package com.utn.TPApiRest.Rodeghiero.controllers;

import com.utn.TPApiRest.Rodeghiero.entities.Libro;
import com.utn.TPApiRest.Rodeghiero.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
