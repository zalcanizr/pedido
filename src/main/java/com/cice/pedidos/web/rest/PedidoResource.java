package com.cice.pedidos.web.rest;


import com.cice.pedidos.service.IPedidoService;
import com.cice.pedidos.web.dto.PedidoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(path="/pedidos")
public class PedidoResource {

//    @Autowired
//    IPedidoService pedidoService;

    void getPedidoById(){

    }
    @RequestMapping (method= RequestMethod.GET, path ="/{id}")
    public String getAllPedidosByUser(@PathVariable (name ="id") String id){
        return "Pedidos mostrados.";
    }
    void crearPedidoByUser(long idUsuario, String usuario){

    }
    void eliminarProductoById(long idUsuario, Long idProducto){

    }



}
