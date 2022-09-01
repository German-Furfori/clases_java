package app.controller;

import app.dtos.request.EmpleadoDTO;
import app.dtos.response.EmpleadoResponseDTO;
import app.service.IEmpleadoService;
import app.service.impl.EmpleadoServiceImpl;

import java.util.List;

public class EmpleadoController {
    IEmpleadoService empleadoService = new EmpleadoServiceImpl();

    public void insertarEmpleado(EmpleadoDTO empleadoDTO) {
        empleadoService.insertEmpleado(empleadoDTO);
    }

    public void deletearEmpleado(Integer id) {
        empleadoService.deleteEmpleado(id);
    }

    public List<EmpleadoResponseDTO> listarEmpleados() {
        return empleadoService.listarEmpleados();
    }

    public EmpleadoResponseDTO updatearEmpleado(EmpleadoDTO empleadoDTO, Integer id) {
        return empleadoService.updateEmpleado(empleadoDTO, id);
    }
}
