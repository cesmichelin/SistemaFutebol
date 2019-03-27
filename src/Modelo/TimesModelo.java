package Modelo;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TimesModelo {

    private String nomeTime;
    private String cidadeTime;
    private String apelidoTime;
    private List<JogadoresModelo> jogadores = new ArrayList<>();

    public TimesModelo(String nomeTime, String cidadeTime, String corTime) {
        this.nomeTime = nomeTime;
        this.cidadeTime = cidadeTime;
        this.apelidoTime = corTime;

    }

    public void addJogadores(JogadoresModelo jogadoresCadastrados) {
        jogadores.add(jogadoresCadastrados);
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public String getCidadeTime() {
        return cidadeTime;
    }

    public String getCorTime() {
        return apelidoTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void setCidadeTime(String cidadeTime) {
        this.cidadeTime = cidadeTime;
    }

    public void setCorTime(String corTime) {
        this.apelidoTime = corTime;
    }

    // Não está sendo usada essa função
    public List<JogadoresModelo> getJogadores() {
        return jogadores;
    }

    // Não está sendo usada essa função
    public void setJogadores(List<JogadoresModelo> jogadores) {
        this.jogadores = jogadores;
    }
}
