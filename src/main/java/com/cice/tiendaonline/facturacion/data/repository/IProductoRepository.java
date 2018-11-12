package com.cice.tiendaonline.facturacion.data.repository;

import com.cice.tiendaonline.facturacion.data.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoEntity, Long> {
}
