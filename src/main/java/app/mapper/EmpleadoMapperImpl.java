package app.mapper;

import app.dtos.response.EmpleadoResponseDTO;
import app.entity.Empleado;
import org.modelmapper.ModelMapper;

public class EmpleadoMapperImpl {
    private ModelMapper objMapper = new ModelMapper();

    public EmpleadoResponseDTO fromEntityToDto(Empleado empleado) {
        return objMapper.map(empleado, EmpleadoResponseDTO.class);
    }
}
