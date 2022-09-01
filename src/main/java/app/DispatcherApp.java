package app;

import app.controller.ClienteController;
import app.controller.EmpleadoController;
import app.controller.PersonaController;
import app.dtos.request.ClienteDTO;
import app.dtos.request.EmpleadoDTO;
import app.dtos.request.PersonaDTO;
import app.dtos.response.ClienteResponseDTO;
import app.dtos.response.EmpleadoResponseDTO;
import app.dtos.response.PersonaResponseDTO;
import app.entity.Cliente;
import app.entity.Empleado;
import app.entity.Persona;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class DispatcherApp { // MVC: el Main es la vista (o sea, este DispatcherApp), el modelo son las Entities, y los controladores los Controller (obviamente)
    public static void main(String[] args) {
        ClienteController clienteController = new ClienteController();
        EmpleadoController empleadoController = new EmpleadoController();
        PersonaController personaController = new PersonaController();

        PersonaDTO personaDTO = new PersonaDTO(1172, "GermánDTO", "FurforiDTO", "Documento del ejemplo DTO");
        PersonaResponseDTO personaResponseDTO;
        EmpleadoDTO empleadoDTO = new EmpleadoDTO(2385, "Empleado con DTO", "Apellido empleado con DTO", "Doc Empleado", 85547, 75000.0);
        EmpleadoResponseDTO empleadoResponseDTO;
        ClienteDTO clienteDTO = new ClienteDTO(879, "Cliente con DTO", "Apellido cliente DTO", "Doc Cliente", 99478, "5/01/2003");
        ClienteResponseDTO clienteResponseDTO;

        List<Persona> personas = new ArrayList<Persona>();

        System.out.println("\nPersonas:\n");

        personas = personaController.listarPersonas();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

        System.out.println();

        for (Persona persona: personas) { // Otra forma de usar un for para mostrar una lista
            System.out.println("persona = " + persona);
        }

        /*personaController.insertarPersona(personaDTO);
        personaResponseDTO = personaController.updatearPersona(personaDTO, personaDTO.getId());
        System.out.println(personaResponseDTO.toString());
        System.out.println(personaController.listarPersonas().toString()); // Antes me mostraba una lista de Personas, ahora es lista de PersonaResponseDTO
        personaController.deletearPersona(personaDTO.getId());

        // Lo mismo para empleadoController y clienteController

        System.out.println("\nEmpleados:\n");

        empleadoController.insertarEmpleado(empleadoDTO);
        empleadoResponseDTO = empleadoController.updatearEmpleado(empleadoDTO, empleadoDTO.getId());
        System.out.println(empleadoResponseDTO.toString());
        System.out.println(empleadoController.listarEmpleados().toString());
        empleadoController.deletearEmpleado(empleadoDTO.getId());

        System.out.println("\nClientes:\n");

        clienteController.insertarCliente(clienteDTO);
        clienteResponseDTO = clienteController.updatearCliente(clienteDTO, clienteDTO.getId());
        System.out.println(clienteResponseDTO.toString());
        System.out.println(clienteController.listarClientes().toString());
        clienteController.deletearCliente(clienteDTO.getId()); */
    }
}

    /*El ejercicio seria el siguiente: ACLARACIÓN: Esta app ya tiene un montón de modificaciones, ya no obedece esta consigna
        1. Crear proyecto con los siguientes paquetes:
        a. app

        De la misma forma como esta en la imagen que anexo. Paquete debe contener los siguientes paquetes:

        b. configuration
        c. constants
        d. controller
        e. entity
        f. mapper
        g. service y dentro de service la carpeta impl.
        j. dto

        Se requiere que creen las entidades para Persona, Cliente, Empleado que esten relacionadas con herencia tal cual lo vimos en clases.

        Se requiere que hagan 3 implementaciones para Persona, Empleado y Cliente que puedan ser usadas por una sola interfaz.

        La interfaz debe tener los metodos insert, update, delete y consulta. Que las mismas muestren el siguiente mensaje de acuerdo a la entidad:
        Por ejemplo si es la implementacion de persona que muestre los siguientes mensajes:

        a. Insertando datos de persona
        b. modificando datos de persona
        c. Borrando datos de persona
        d. Consultando los datos de persona

        Hacer lo mismo para las implentaciones de Cliente y la de Empleado.

        El programa DispatcherApp debe llamar a los controladores que a su vez llamaran a las implementacion de las interfaces dependiendo de cada caso, es decir cada controlador llamara a su implementacion y mostrara los mensajes de cada implementacion.

        Crear clases DTO para las clases de personas, empleados y clientes, para ser usadas en los mapper en clases.

        Favor estudiar el tema de JDBC para conexiones nativas a bases de datos.*/
