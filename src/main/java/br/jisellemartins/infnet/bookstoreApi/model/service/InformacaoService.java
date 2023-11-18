package br.jisellemartins.infnet.bookstoreApi.model.service;

import br.jisellemartins.infnet.bookstoreApi.model.domain.Informacao;
import br.jisellemartins.infnet.bookstoreApi.model.repository.InformacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformacaoService {
    @Autowired
    private InformacaoRepository informacaoRepository;

    public List<Informacao> obterInformcao() {
        return (List<Informacao>) informacaoRepository.findAll();
    }

    public Informacao incluirInformacao(Informacao informacao) {
        return informacaoRepository.save(informacao);
    }
}
