package io.github.helio.domain.service;

import io.github.helio.domain.entity.Pedido;
import io.github.helio.domain.enums.StatusPedido;
import io.github.helio.domain.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto );

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}