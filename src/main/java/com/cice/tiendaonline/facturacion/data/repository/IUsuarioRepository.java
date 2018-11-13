package com.cice.tiendaonline.facturacion.data.repository;

import com.cice.tiendaonline.facturacion.data.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
