package com.teset.webService;

import com.teset.dto.cliente.ClienteResponseDTO;
import com.teset.dto.cliente.DetalleResponseDTO;
import com.teset.dto.negocio.ComercioResponseDTO;

import java.util.List;

public interface IWebServiceTesetClient {

    ClienteResponseDTO getClienteTeset(String dni) ;
    List<DetalleResponseDTO> getDetallesClienteTeset(String dni);
    List<ComercioResponseDTO> getComerciosAdheridosTeset();

}
