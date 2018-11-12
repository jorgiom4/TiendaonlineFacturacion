package com.cice.tiendaonline.facturacion.feign;

import com.cice.tiendaonline.facturacion.web.dto.PedidoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("pedidos")
public interface IPedidosFeign {

    @RequestMapping(method = RequestMethod.GET, path = "/pedidos")
    List<PedidoDTO> getPedidos();

    @RequestMapping(method = RequestMethod.GET, path = "/pedidos/{id}")
    PedidoDTO getPedidoById(@PathVariable(name = "id") Long idPedido);

}
