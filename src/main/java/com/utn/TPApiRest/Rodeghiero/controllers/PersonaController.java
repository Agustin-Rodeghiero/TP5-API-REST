package com.utn.TPApiRest.Rodeghiero.controllers;

import com.utn.TPApiRest.Rodeghiero.entities.Persona;
import com.utn.TPApiRest.Rodeghiero.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl>{

}
