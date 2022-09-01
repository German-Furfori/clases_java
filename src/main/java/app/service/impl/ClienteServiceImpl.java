package app.service.impl;

import app.dtos.request.ClienteDTO;
import app.dtos.response.ClienteResponseDTO;
import app.entity.Cliente;
import app.mapper.ClienteMapperImpl;
import app.mapper.EmpleadoMapperImpl;
import app.service.IClienteService;

import java.util.ArrayList;
import java.util.List;

public class ClienteServiceImpl implements IClienteService {

    ClienteMapperImpl clienteMapperImpl = new ClienteMapperImpl();

    @Override
    public void insertCliente(ClienteDTO clienteDTO) {
        System.out.println("Insertando al cliente: " + clienteDTO.toString());
    }

    @Override
    public void deleteCliente(Integer id) {
        System.out.println("Borrando datos del cliente con id: " + id);
    }

    @Override
    public List<ClienteResponseDTO> listarClientes() {
        Cliente cliente1 = new Cliente(99, "Don", "Ramón", "12548965", 875, "14/06/1962");
        Cliente cliente2 = new Cliente(59, "Doña", "Florinda", "19547852", 195, "19/11/1975");
        List<ClienteResponseDTO> lista = new ArrayList<ClienteResponseDTO>();

        lista.add(clienteMapperImpl.fromEntityToDto(cliente1));
        lista.add(clienteMapperImpl.fromEntityToDto(cliente2));

        return lista;
    }

    @Override
    public ClienteResponseDTO updateCliente(ClienteDTO clienteDTO, Integer id) {
        Cliente clienteModificado = new Cliente();

        clienteModificado.setId(id);
        clienteModificado.setNombre(clienteDTO.getNombre());
        clienteModificado.setApellido(clienteDTO.getApellido());
        clienteModificado.setDNI(clienteDTO.getDNI());
        clienteModificado.setIdCliente(clienteDTO.getIdCliente());
        clienteModificado.setInicioActividades(clienteDTO.getInicioActividades());

        return clienteMapperImpl.fromEntityToDto(clienteModificado);
    }
}
