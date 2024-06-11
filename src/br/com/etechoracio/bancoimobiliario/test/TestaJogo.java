package br.com.etechoracio.bancoimobiliario.test;
import br.com.etechoracio.bancoimobiliario.model.Jogador;
import java.util.ArrayList;
import java.util.List;

public class TestaJogo {
    public static void  main(String[] args) {
        List<Jogador> jogadores  = new ArrayList<>();
        jogadores.add(new Jogador("Rogério", 10000));
        jogadores.add(new Jogador("Marion", 10000));
        jogadores.add(new Jogador("Edson", 10000));

        String sigla = "M";
        String operacao = "C";
        double valor = 5000;
        String finalSigla1 = sigla;
        Jogador jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(finalSigla1))
                .findFirst().orElseThrow();
        jogador.jogar(operacao,valor);

         sigla = "E";
         operacao = "C";
         valor = 3000;
        String finalSigla2 = sigla;
        jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(finalSigla2))
                .findFirst().orElseThrow();
        jogador.jogar(operacao,valor);

        sigla = "M";
        operacao = "C";
        valor = 1000;
        String finalSigla3 = sigla;
        jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(finalSigla3))
                .findFirst().orElseThrow();
        jogador.jogar(operacao,valor);
    }

}
