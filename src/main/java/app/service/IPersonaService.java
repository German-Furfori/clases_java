package app.service;

import app.dtos.request.PersonaDTO;
import app.dtos.response.PersonaResponseDTO;
import app.entity.Persona;

import java.util.List;

public interface IPersonaService {

    List<Persona> getAllPersonas();

    /*void insertPersona(PersonaDTO personaDTO);
    void deletePersona(Integer id);
    List<PersonaResponseDTO> listarPersonas();
    PersonaResponseDTO updatePersona(PersonaDTO personaDTO, Integer id);*/
}
