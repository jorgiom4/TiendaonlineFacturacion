package com.cice.tiendaonline.facturacion.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Facturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaEntity {

    private Long id;
    private Long idUsuario;
    private List<ProductoEntity> productos;
    private Double importe;
    private String fecha;

}
