package app.entity;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Empleado extends Persona {
    private Integer idEmpleado;
    private Double sueldo;

    public Empleado(Integer id, String nombre, String apellido, String DNI, Integer idEmpleado, Double sueldo) {
        super(id, nombre, apellido, DNI);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }
}
