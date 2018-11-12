package com.cice.tiendaonline.facturacion.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoEntity {

    private Long id;
    private List<ProductoEntity> productos;
    private Double total;

}
