package com.projetoJava.Service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.projetoJava.Mapper.MonitoramentoMapper;

@Slf4j
@Service
@RequiredArgsConstructor
public class MonitoramentoService implements IMonitoramentoService{

    private MonitoramentoMapper monitoramentoMapper;



    @Override
    public Long buscaId(Long id) {
        log.info("Buscando id: {}", id);
        return monitoramentoMapper.buscaId(id);
    }
}
