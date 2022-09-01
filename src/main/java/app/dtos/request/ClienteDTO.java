package app.dtos.request;

import lombok.*;

@Setter
@Getter
public class ClienteDTO extends PersonaDTO {
    private Integer idCliente;
    private String inicioActividades;

    public ClienteDTO() {
    }

    public ClienteDTO(Integer id, String nombre, String apellido, String DNI, Integer idCliente, String inicioActividades) {
        super(id, nombre, apellido, DNI);
        this.idCliente = idCliente;
        this.inicioActividades = inicioActividades;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" +
                "idCliente=" + idCliente +
                ", inicioActividades='" + inicioActividades + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
