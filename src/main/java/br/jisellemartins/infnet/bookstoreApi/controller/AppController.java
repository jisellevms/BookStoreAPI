package br.jisellemartins.infnet.bookstoreApi.controller;

import br.jisellemartins.infnet.bookstoreApi.model.domain.Informacao;
import br.jisellemartins.infnet.bookstoreApi.model.service.InformacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/informacao")
@RestController
public class AppController {
    @Autowired
    private InformacaoService informacaoService;

    @GetMapping(value = "/lista")
    public List<Informacao> obterInformacao() {
        return informacaoService.obterInformcao();
    }

    @PostMapping(value = "/incluir")
    public Informacao incluirInformacao(@RequestBody Informacao informacao) {
        return informacaoService.incluirInformacao(informacao);
    }

}
