package app.dtos.response;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class EmpleadoResponseDTO extends PersonaResponseDTO { // No se realiza herencia entre los responseDTO, ver bien después para corregir esto
    private Integer idEmpleado;
    private Double sueldo;

    public EmpleadoResponseDTO(Integer id, String nombre, String apellido, String DNI, Integer idEmpleado, Double sueldo) {
        super(id, nombre, apellido, DNI);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "EmpleadoResponseDTO{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
