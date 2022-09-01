package app.dtos.response;

import lombok.*;

@Setter
@Getter
public class ClienteResponseDTO extends PersonaResponseDTO {
    private Integer idCliente;
    private String inicioActividades;

    public ClienteResponseDTO() {
    }

    public ClienteResponseDTO(Integer id, String nombre, String apellido, String DNI, Integer idCliente, String inicioActividades) {
        super(id, nombre, apellido, DNI);
        this.idCliente = idCliente;
        this.inicioActividades = inicioActividades;
    }

    @Override
    public String toString() {
        return "ClienteResponseDTO{" +
                "idCliente=" + idCliente +
                ", inicioActividades='" + inicioActividades + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
