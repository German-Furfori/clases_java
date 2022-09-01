package app.service.impl;

import app.dtos.request.EmpleadoDTO;
import app.dtos.response.EmpleadoResponseDTO;
import app.dtos.response.PersonaResponseDTO;
import app.entity.Empleado;
import app.entity.Persona;
import app.mapper.EmpleadoMapperImpl;
import app.mapper.PersonaMapperImpl;
import app.service.IEmpleadoService;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoServiceImpl implements IEmpleadoService {

    private EmpleadoMapperImpl empleadoMapperImpl = new EmpleadoMapperImpl();

    @Override
    public void insertEmpleado(EmpleadoDTO empleadoDTO) {
        System.out.println("Insertando al empleado: " + empleadoDTO.toString());
    }

    @Override
    public void deleteEmpleado(Integer id) {
        System.out.println("Borrando datos del empleado con id: " + id);
    }

    @Override
    public List<EmpleadoResponseDTO> listarEmpleados() {
        Empleado empleado1 = new Empleado(85, "Juan", "Rodriguez", "311458", 132456, 200000.0);
        Empleado empleado2 = new Empleado(49, "Pedro", "Ramirez", "365581", 55586, 350000.0);
        List<EmpleadoResponseDTO> lista = new ArrayList<EmpleadoResponseDTO>();

        lista.add(empleadoMapperImpl.fromEntityToDto(empleado1));
        lista.add(empleadoMapperImpl.fromEntityToDto(empleado2));

        return lista;
    }

    @Override
    public EmpleadoResponseDTO updateEmpleado(EmpleadoDTO empleadoDTO, Integer id) {
        Empleado empleadoModificado = new Empleado();

        empleadoModificado.setId(id);
        empleadoModificado.setNombre(empleadoDTO.getNombre());
        empleadoModificado.setApellido(empleadoDTO.getApellido());
        empleadoModificado.setDNI(empleadoDTO.getDNI());
        empleadoModificado.setIdEmpleado(empleadoDTO.getIdEmpleado());
        empleadoModificado.setSueldo(empleadoDTO.getSueldo());

        return empleadoMapperImpl.fromEntityToDto(empleadoModificado);
    }

    /*@Override
    public void insert(String nombre, String apellido) {
        System.out.println("Insertando datos del empleado " + nombre + " " + apellido);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Borrando datos del empleado con id: " + id);
    }

    @Override
    public String listarTodos() {
        return "Listando datos de empleados";
    }

    @Override
    public String update(String nombre, String apellido, Integer id) {
        return "Updateando datos del empleado " + nombre + " " + apellido;
    }*/
}
