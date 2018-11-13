package com.cice.tiendaonline.facturacion.service;

import com.cice.tiendaonline.facturacion.web.dto.FacturaDTO;

import java.util.List;
import java.util.Optional;

public interface IFacturaService {

    Long newFactura(FacturaDTO factura);

    List<FacturaDTO> findAllFacturas();

    Optional<FacturaDTO> findFacturaById(Long id);

    FacturaDTO updateFactura(FacturaDTO factura);

    Long deleteFactura(Long id);

}
