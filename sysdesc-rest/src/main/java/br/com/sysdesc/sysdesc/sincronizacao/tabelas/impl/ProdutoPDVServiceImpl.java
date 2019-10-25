package br.com.sysdesc.sysdesc.sincronizacao.tabelas.impl;

import org.springframework.stereotype.Service;

import br.com.sysdesc.dto.sincronizacao.tabelas.ProdutoDTO;
import br.com.sysdesc.sysdesc.sincronizacao.service.impl.SincronizaItemServiceImpl;
import br.com.sysdesc.sysdesc.sincronizacao.util.SincronizacaoTabelaEnum;

@Service("produto")
public class ProdutoPDVServiceImpl extends SincronizaItemServiceImpl<ProdutoDTO> {

    @Override
    public SincronizacaoTabelaEnum getTabela() {

        return SincronizacaoTabelaEnum.PRODUTO;
    }

}
