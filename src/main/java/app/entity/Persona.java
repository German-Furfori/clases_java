package app.entity;

import app.service.IServicios;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona {
    protected Integer id;
    protected String nombre, apellido, DNI;

    public Persona(String nombre, String apellido, String DNI) { // Éste constructor lo voy a usar para la DB, puse todos los atributos MENOS el id, que se pone solo en la tabla
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
}
