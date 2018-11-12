package com.cice.tiendaonline.facturacion.data.repository;

import com.cice.tiendaonline.facturacion.data.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepository extends JpaRepository<PedidoEntity, Long> {
}
