package app.dtos.request;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class EmpleadoDTO extends PersonaDTO {
    private Integer idEmpleado;
    private Double sueldo;

    public EmpleadoDTO(Integer id, String nombre, String apellido, String DNI, Integer idEmpleado, Double sueldo) {
        super(id, nombre, apellido, DNI);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "EmpleadoDTO{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
