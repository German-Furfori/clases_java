package app.mapper;

import app.dtos.response.PersonaResponseDTO;
import app.entity.Persona;
import org.modelmapper.ModelMapper;

public class PersonaMapperImpl {
    private ModelMapper objMapper = new ModelMapper();

    public PersonaResponseDTO fromEntityToDto(Persona persona) { // De entidad a DTO
        return objMapper.map(persona, PersonaResponseDTO.class); // Mapea de uno (Object source) a otro (Destination Type, PersonaResponseDTO en este caso)
    }
}
