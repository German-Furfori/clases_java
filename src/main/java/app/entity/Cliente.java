package app.entity;

import lombok.*;

@Setter
@Getter
@ToString
public class Cliente extends Persona {
    private Integer idCliente;
    private String inicioActividades;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellido, String DNI, Integer idCliente, String inicioActividades) {
        super(id, nombre, apellido, DNI);
        this.idCliente = idCliente;
        this.inicioActividades = inicioActividades;
    }
}
