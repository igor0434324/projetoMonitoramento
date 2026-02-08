package com.projetoJava.Service;

import com.projetoJava.Mapper.MonitoramentoMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MonitoramentoService implements IMonitoramentoService{

    private MonitoramentoMapper monitoramentoMapper;



    @Override
    public Long buscaId(Long id) {
        return monitoramentoMapper.buscaId(id);
    }
}
