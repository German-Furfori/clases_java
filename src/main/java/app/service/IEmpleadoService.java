package app.service;

import app.dtos.request.EmpleadoDTO;
import app.dtos.response.EmpleadoResponseDTO;

import java.util.List;

public interface IEmpleadoService {
    void insertEmpleado(EmpleadoDTO empleadoDTO);
    void deleteEmpleado(Integer id);
    List<EmpleadoResponseDTO> listarEmpleados();
    EmpleadoResponseDTO updateEmpleado(EmpleadoDTO empleadoDTO, Integer id);
}
