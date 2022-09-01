package app.controller;

import app.dtos.request.ClienteDTO;
import app.dtos.response.ClienteResponseDTO;
import app.service.IClienteService;
import app.service.impl.ClienteServiceImpl;

import java.util.List;

public class ClienteController {
    IClienteService clienteService = new ClienteServiceImpl();

    public void insertarCliente(ClienteDTO clienteDTO) {
        clienteService.insertCliente(clienteDTO);
    }

    public void deletearCliente(Integer id) {
        clienteService.deleteCliente(id);
    }

    public List<ClienteResponseDTO> listarClientes() {
        return clienteService.listarClientes();
    }

    public ClienteResponseDTO updatearCliente(ClienteDTO clienteDTO, Integer id) {
        return clienteService.updateCliente(clienteDTO, id);
    }
}
