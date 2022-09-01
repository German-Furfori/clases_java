package app.mapper;

import app.dtos.response.ClienteResponseDTO;
import app.entity.Cliente;
import org.modelmapper.ModelMapper;

public class ClienteMapperImpl {
    private ModelMapper objMapper = new ModelMapper();

    public ClienteResponseDTO fromEntityToDto(Cliente cliente) {
        return objMapper.map(cliente, ClienteResponseDTO.class);
    }
}
