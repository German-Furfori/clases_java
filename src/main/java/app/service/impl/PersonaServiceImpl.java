package app.service.impl;

import app.configuration.ConnectionDB;
import app.constants.Constants;
import app.dtos.request.PersonaDTO;
import app.dtos.response.PersonaResponseDTO;
import app.entity.Persona;
import app.mapper.PersonaMapperImpl;
import app.service.IPersonaService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaServiceImpl implements IPersonaService { // Esta clase se encarga de toda la lógica

    private PersonaMapperImpl personaMapperImpl = new PersonaMapperImpl();
    private ConnectionDB connectionDB;

    @Override
    public List<Persona> getAllPersonas() { // Obtengo la lista de personas de la tabla de la DB
        connectionDB = new ConnectionDB();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null; // Uso esta variable para ir llenando los campos y después hacer el .add al array de personas
        List<Persona> personas = new ArrayList<>(); // Voy a retornar esta lista llena con las filas de la tabla personas

        try {
            conn = connectionDB.getConnection(); // Primero abrimos la conexión
            stmt = conn.prepareStatement(Constants.SQL_SELECT_PERSON); // Después le decimos a esa conexión que es lo que necesitamos hacer con la conexión
            rs = stmt.executeQuery(); // Result Set, acá están los resultados que necesitamos

            while (rs.next()) { // rs.next() va avanzando por la tabla hasta llegar al final, retorna false cuando termina. Parecido al while(*FILE != false) en C
                int id = rs.getInt("id_persona");
                String nombre = rs.getString("nombre"); // me devuelve el string ubicado en la columna "nombre", en la primer iteración será el primer nombre, etc
                String apellido = rs.getString("apellido");
                String DNI = rs.getString("DNI");

                persona = new Persona(id, nombre, apellido, DNI);

                personas.add(persona);
            }
        } catch (SQLException e) { // El IDE me decía que no estaba "handleando" la excepción, así que hay que usar un try catch
            throw new RuntimeException(e);
        }
        finally {
            try { // CIERRO LA CONEXIÓN; FUNDAMENTAL!!!!!! No es que si no lo hago no anda, es más lo probé sin esto y anda. Pero es una horrible práctica no cerrar las conexiones
                connectionDB.close(rs); // Primero cierro el result set
                connectionDB.close(stmt); // Después el Statement
                connectionDB.close(conn); // Y después la conexión, voy cerrando del último que abrí al primero (LIFO)
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return personas;
    }

    /*@Override
    public void insertPersona(PersonaDTO personaDTO) { // Por qué es void? Y update no?
        System.out.println("Insertando a: " + personaDTO.toString());
    }

    @Override
    public void deletePersona(Integer id) {
        System.out.println("Borrando datos de la persona con id: " + id);
    }

    @Override
    public List<PersonaResponseDTO> listarPersonas() {
        Persona persona1 = new Persona(85, "Pepe", "Arnaldo", "454545");
        Persona persona2 = new Persona(36, "Pipo", "Perez", "857845");
        List<PersonaResponseDTO> lista = new ArrayList<PersonaResponseDTO>();

        lista.add(personaMapperImpl.fromEntityToDto(persona1));
        lista.add(personaMapperImpl.fromEntityToDto(persona2));

        return lista;
    }

    @Override
    public PersonaResponseDTO updatePersona(PersonaDTO personaDTO, Integer id) {
        Persona personaModificada = new Persona();

        personaModificada.setNombre(personaDTO.getNombre()); // Seteo el nombre del objeto persona que paso por parámetro al objeto personaModificada
        personaModificada.setApellido(personaDTO.getApellido());
        personaModificada.setDNI(personaDTO.getDNI());
        personaModificada.setId(id);

        return personaMapperImpl.fromEntityToDto(personaModificada);
    }*/
}
