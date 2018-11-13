package com.cice.tiendaonline.facturacion.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacturaDTO {

    private Long id;
    private Long idUsuario;
    private Double importe;
    private String fecha;
}
