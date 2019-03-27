package Modelo;

import java.util.ArrayList;
import java.util.List;

// Criação da Classe Modelo
public class CampeonatoModelo {

    // Atributos = visibilidade tipo nomeDoAtributo;
    private String nomeCampeonato;
    private String pais;
    private int quantidadeTimes;

    // Adiciona List<tipo> nomeDaLista = Inicializando Array
    private List<TimesModelo> times = new ArrayList<>();

    // Método = visibilidade (com retorno, logo não é void) tipo parâmetro) { retorno }
public CampeonatoModelo (String nomeCampeonato, String pais, int quantidadeTimes){
    this.nomeCampeonato = nomeCampeonato;
    this.pais = pais;
    this.quantidadeTimes = quantidadeTimes;

}
// Método = adiciona timesCadastrados aos ArrayList times
public void addTimes(TimesModelo timesCadastrados){
    times.add(timesCadastrados);

}

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public String getPais() {
        return pais;
    }

    public int getQuantidadeTimes() {
        return quantidadeTimes;
    }

    public List<TimesModelo> getTimes() {return times;}

    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setQuantidadeTimes(int quantidadeTimes) {
        this.quantidadeTimes = quantidadeTimes;
    }

    public void setTimes(List<TimesModelo> times) {
        this.times = times;
    }
}



