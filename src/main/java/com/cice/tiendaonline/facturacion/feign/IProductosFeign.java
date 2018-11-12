package com.cice.tiendaonline.facturacion.feign;

import com.cice.tiendaonline.facturacion.web.dto.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("productos")
public interface IProductosFeign {

    @RequestMapping(method = RequestMethod.GET, path = "/productos")
    List<ProductoDTO> getProductos();

    @RequestMapping(method = RequestMethod.GET, path = "/productos/{id}")
    ProductoDTO getProductoById(@PathVariable(name = "id") Long idProducto);
}
