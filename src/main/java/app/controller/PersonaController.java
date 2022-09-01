package app.controller;

import app.dtos.request.PersonaDTO;
import app.dtos.response.PersonaResponseDTO;
import app.entity.Persona;
import app.service.IPersonaService;
import app.service.IServicios;
import app.service.impl.PersonaServiceImpl;

import java.util.List;

public class PersonaController {

    IPersonaService personaService = new PersonaServiceImpl();

    public List<Persona> listarPersonas() {
        return personaService.getAllPersonas();
    }

    /*public void insertarPersona(PersonaDTO personaDTO) {
        personaService.insertPersona(personaDTO);
    }

    public void deletearPersona(Integer id) {
        personaService.deletePersona(id);
    }

    public List<PersonaResponseDTO> listarPersonas() {
        return personaService.listarPersonas();
    }

    public PersonaResponseDTO updatearPersona(PersonaDTO personaDTO, Integer id) {
        return personaService.updatePersona(personaDTO, id);
    }*/
}
