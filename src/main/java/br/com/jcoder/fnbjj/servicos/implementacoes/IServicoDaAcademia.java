package br.com.jcoder.fnbjj.servicos.implementacoes;

import br.com.jcoder.fnbjj.modelos.Academia;
import br.com.jcoder.fnbjj.modelos.Federacao;
import br.com.jcoder.fnbjj.repositorios.RepositorioDaAcademia;
import br.com.jcoder.fnbjj.servicos.ServicoDaAcademia;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class IServicoDaAcademia extends IServicoGenerico<Academia, Integer> implements ServicoDaAcademia {

    private RepositorioDaAcademia repositorioDaAcademia;

    IServicoDaAcademia(RepositorioDaAcademia repositorioDaAcademia) {
        super(repositorioDaAcademia);
        this.repositorioDaAcademia = repositorioDaAcademia;
    }

    @Override
    public Collection<Academia> findAcademiasByFederacao(Federacao federacao) {
        return this.repositorioDaAcademia.findAcademiasByFederacao(federacao);
    }

    @Override
    public Optional<Academia> findAcademiaByRegistro(String registro) {
        return this.repositorioDaAcademia.findAcademiaByRegistro(registro);
    }
}
