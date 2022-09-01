package app.service;

import app.dtos.request.ClienteDTO;
import app.dtos.response.ClienteResponseDTO;

import java.util.List;

public interface IClienteService {
    void insertCliente(ClienteDTO clienteDTO);
    void deleteCliente(Integer id);
    List<ClienteResponseDTO> listarClientes();
    ClienteResponseDTO updateCliente(ClienteDTO clienteDTO, Integer id);
}
