package com.projetoJava.Controller;

import com.projetoJava.Service.MonitoramentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class monitoramnetoController {

    private MonitoramentoService service;


    @GetMapping
    public Long buscaId(Long id) {
        return service.buscaId(id);
    }
}
