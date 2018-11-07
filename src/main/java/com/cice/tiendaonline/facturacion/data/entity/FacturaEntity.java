package com.cice.tiendaonline.facturacion.data.entity;

import javax.persistence.Entity;

@Entity

public class FacturaEntity {

    private Long id;
    private Long idUsuario;
    private Double importe;
    private String fecha;

}
