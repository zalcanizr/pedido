package com.cice.pedidos.service.impl;


import com.cice.pedidos.entity.PedidoEntity;
import com.cice.pedidos.repository.IPedidoRepository;
import com.cice.pedidos.service.IPedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements IPedidoService{



    IPedidoRepository pedidoRepository;

    public void crearPedido(Long idPedido){
        PedidoEntity entity=new PedidoEntity()
    }

    public void eliminarPedido(Long idPedido){}

    public void recuperarPedido(Long idPedido){}

    public void pagarPedido(Long idPedido){}

    public void getAllPedidosByUser(String idUsuario){
        List<PedidosDTO> collect = pedidoRepository.getAllPedidosByUser(idUsuario)
            .stream()
            .map(entity -> new PedidoDTO(
                    entity.getIdProducto(),
                    entity.getIdUsuario(),
                    entity.getNombre(),
                    entity.getCodigo()
            )).collect(Collectors.toList());
        return collect;}

}
