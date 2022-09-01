package app.dtos.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonaDTO { // Puede haber herencia o no, dependiendo el caso
    protected Integer id;
    protected String nombre, apellido, DNI;
}
