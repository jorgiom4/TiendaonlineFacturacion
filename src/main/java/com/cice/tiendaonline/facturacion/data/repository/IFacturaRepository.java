package com.cice.tiendaonline.facturacion.data.repository;

import com.cice.tiendaonline.facturacion.data.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepository extends JpaRepository<FacturaEntity, Long> {
}
