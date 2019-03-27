package Modelo;

public class JogadoresModelo {

    private String nomeJogador;
    private String posicaoJogador;
    private String numeroJogador;

    // Construtor padrão que deve ser criado SE houver outro construtor declarado
public JogadoresModelo(){
}

// Outro construtor declarado, mas ainda sem uso
public JogadoresModelo(String nomeJogador, String posicaoJogador, String numeroJogador){
    this.nomeJogador = nomeJogador;
    this.posicaoJogador = posicaoJogador;
    this.numeroJogador = numeroJogador;

}

    public String getNomeJogador() {
        return nomeJogador;
    }

    public String getPosicaoJogador() {
        return posicaoJogador;
    }

    public String getNumeroJogador() {
        return numeroJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setPosicaoJogador(String posicaoJogador) {
        this.posicaoJogador = posicaoJogador;
    }

    public void setNumeroJogador(String numeroJogador) {
        this.numeroJogador = numeroJogador;
    }
}

