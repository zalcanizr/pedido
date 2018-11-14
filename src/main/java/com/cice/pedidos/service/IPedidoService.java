package com.cice.pedidos.service;

public interface IPedidoService {


    public void crearPedido(Long idPedido);

    public void eliminarPedido(Long idPedido);

    public void recuperarPedido(Long idPedido);

    public void pagarPedido(Long idPedido);

    public String getAllPedidosByUser(String idUsuario);




}
