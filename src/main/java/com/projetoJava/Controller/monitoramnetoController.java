package com.projetoJava.Controller;

import com.projetoJava.Service.IMonitoramentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitoramento")
public class monitoramnetoController {

    @Autowired
    private IMonitoramentoService service;



    @GetMapping("/recuperar/{id}")
    public Long buscaId(@PathVariable("id") Long id) {
        return service.buscaId(id);
    }
}
