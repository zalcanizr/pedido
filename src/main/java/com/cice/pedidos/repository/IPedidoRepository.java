package com.cice.pedidos.repository;

public interface IPedidoRepository {

    void getPedidoByIdPedido(long idPedido);
    void getAllPedidosByUser(String idUsuario);
    void eliminarProductoByIdPedido(long idPedido, Long idProducto);
    void eliminarPedidoByIdPedido(long idPedido);

}
