package Principal;

import Modelo.CampeonatoModelo;
import Modelo.JogadoresModelo;
import Modelo.TimesModelo;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class Principal {


    // Método Principal
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);


        //Construtor Scanner (askUser = nome do Scanner)
        Scanner askUserCampeonato = new Scanner(System.in);

        System.out.println("Indique o Campeonato");
        String nomeCampeonatoUser = askUserCampeonato.next();

        System.out.println("De qual país é o Campeonato?");
        String paisCampeonatoUser = askUserCampeonato.next();

        /*System.out.println("Quantos times disputam esse Campeonato?");
        int quantidadeDeTimesUser = askUserCampeonato.nextInt();*/

        // Construtor objeto CampeonatoModelo (necessário incluir todos os atributos)
        CampeonatoModelo brasileiro = new CampeonatoModelo(nomeCampeonatoUser, paisCampeonatoUser, 2);

        //TODO Quantidade de times dinâmica (User)
        //atribuindo variáveis
        brasileiro.setNomeCampeonato(nomeCampeonatoUser);
        brasileiro.setPais(paisCampeonatoUser);
        brasileiro.setQuantidadeTimes(2);

        System.out.println(brasileiro.getNomeCampeonato() + " | " + brasileiro.getPais() + " | " + brasileiro.getQuantidadeTimes());

        for (int i = 1; i <= brasileiro.getQuantidadeTimes(); i++) {

            System.out.println("Insira um novo time");
            String nomeTimeUser = askUserCampeonato.next();

            System.out.println("De qual cidade?");
            String cidadeTimeUser = askUserCampeonato.next();

            System.out.println("Qual apelido do time?");
            String apelidoTimeUser = askUserCampeonato.next();

            System.out.println("Quantos jogadores quer incluir nesse time?");
            int quantidadeJogadoresNoTime = askUserCampeonato.nextInt();


            // Cria objeto
            TimesModelo time1 = new TimesModelo(nomeTimeUser, cidadeTimeUser, apelidoTimeUser);
            time1.setNomeTime(nomeTimeUser);
            time1.setCidadeTime(cidadeTimeUser);
            time1.setCorTime(apelidoTimeUser);

            // Chama Método addTimes (Array)
            brasileiro.addTimes(time1);

            /* >>>>>>>> CRIAR UM FOR PARA INSERIR JOGADORES - CHAMAR MÉTODO ADDJOGADORES - DEFINIR A QUANTIDADE - INSERIR OS JOGADORES - SOUT DA MESMA FORMA
            >>>>>>>>>>> CRIAR AS DATAS DAS PARTIDAS
            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/


            for (int j = 1; j <= quantidadeJogadoresNoTime; j++) {

                System.out.println("Nome do Jogador");
                String nomeDoJogador = askUserCampeonato.next();

                System.out.println("Posição");
                String posicaoDoJogador = askUserCampeonato.next();

                System.out.println("Qual o número?");
                String numeroDoJogador = askUserCampeonato.next();

                JogadoresModelo jogador1 = new JogadoresModelo(nomeDoJogador, posicaoDoJogador, numeroDoJogador);
                jogador1.setNomeJogador(nomeDoJogador);
                jogador1.setPosicaoJogador(posicaoDoJogador);
                jogador1.setNumeroJogador(numeroDoJogador);

                //Chama Método addJogadores
                time1.addJogadores(jogador1);

            }

        }

        System.out.println(brasileiro.getNomeCampeonato());
        System.out.println("----------------------------");

        for (int i = 0; i < brasileiro.getTimes().size(); i++) {
            System.out.println(brasileiro.getTimes().get(i).getNomeTime()
                    + " | "
                    + brasileiro.getTimes().get(i).getCidadeTime()
                    + " | "
                    + brasileiro.getTimes().get(i).getCorTime());

            for (int j = 0; j < brasileiro.getTimes().get(i).getJogadores().size(); j++) {
                System.out.println(brasileiro.getTimes().get(i).getJogadores().get(j).getNumeroJogador()
                        + " | "
                        + brasileiro.getTimes().get(i).getJogadores().get(j).getNomeJogador()
                        + " | "
                        + brasileiro.getTimes().get(i).getJogadores().get(j).getPosicaoJogador());

            }
        }


        for (int i = 1; i < brasileiro.getTimes().size(); i++) {
            System.out.println(brasileiro.getTimes().get(0).getNomeTime()
                    + " X "
                    + brasileiro.getTimes().get(1).getNomeTime());

            //todo Deixar a posição dinâmica (fazendo conta i-1)



        }
    }

}