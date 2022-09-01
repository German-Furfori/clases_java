package app.dtos.response;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonaResponseDTO { // En los ResponseDTO no debería haber herencia, corregir eso
    protected Integer id;
    protected String nombre, apellido, DNI;
}
