package com.digitalinnovation.controlpoint.controller;

import com.digitalinnovation.controlpoint.model.JornadaTrabalho;
import com.digitalinnovation.controlpoint.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada (@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList () {
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public JornadaTrabalho getJornadaById (@PathVariable("idJornada") Long idJornada) throws Exception {
        return jornadaService.getById(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada"));
    }

    @PutMapping
    public JornadaTrabalho updateJornada (@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.update(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public JornadaTrabalho deleteById (@PathVariable("idJornada") Long idJornada) throws Exception {
        return jornadaService.deleteJornada(idJornada);
    }

}
