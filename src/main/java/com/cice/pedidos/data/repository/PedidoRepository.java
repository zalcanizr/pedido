package com.cice.pedidos.data.repository;

import com.cice.pedidos.data.entity.PedidoEntity;
import com.cice.pedidos.web.rest.PedidoResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity,Long>{

    void getPedidoByIdPedido(long idPedido);
    List<PedidoEntity> getAllPedidosByUser(String idUsuario);
    void eliminarProductoByIdPedido(long idPedido, Long idProducto);
    void eliminarPedidoByIdPedido(long idPedido);
}
