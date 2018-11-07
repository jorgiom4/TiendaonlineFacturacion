package com.cice.tiendaonline.facturacion.web.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacturaRestDTO {

    private Long id;
    private Long idUsuario;
    private Double importe;
    private String fecha;
}
