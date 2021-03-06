package com.cice.tiendaonline.facturacion.data.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoEntity {

    @Id
    private Long id;
    private String nombre;
    private Long precio;
}
