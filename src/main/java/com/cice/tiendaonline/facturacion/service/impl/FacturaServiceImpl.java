package com.cice.tiendaonline.facturacion.service.impl;

import com.cice.tiendaonline.facturacion.data.repository.IFacturaRepository;
import com.cice.tiendaonline.facturacion.service.IFacturaService;
import com.cice.tiendaonline.facturacion.web.dto.FacturaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    IFacturaRepository facturaRepository;

    @Override
    public Long newFactura(FacturaDTO factura) {
        return null;
    }

    @Override
    public List<FacturaDTO> findAllFacturas() {

        return null;
    }

    @Override
    public Optional<FacturaDTO> findFacturaById(Long id) {
        return Optional.empty();
    }

    @Override
    public FacturaDTO updateFactura(FacturaDTO factura) {
        return null;
    }

    @Override
    public Long deleteFactura(Long id) {
        return null;
    }
}
