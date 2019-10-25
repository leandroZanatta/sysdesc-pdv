package br.com.sysdesc.sysdesc.sincronizacao.intercomm.client;

import java.util.List;

import br.com.sysdesc.dto.sincronizacao.SincronizacaoItemDTO;
import feign.RequestLine;

public interface SincronizacaoTabelasClient {

    @RequestLine("GET /sincronizacaoTabelas/buscarVersoesSincronizacao")
    public abstract List<SincronizacaoItemDTO> buscarVersoesSincronizacao();
}
