package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Jogador jogador = new Jogador("Messi", 36, "atacante", new Time("Inter Miami", "MLS"));

        Jogador jogadorClone = jogador.clone();
        jogadorClone.setNome("Lucas");
        jogadorClone.setIdade(30);
        jogadorClone.getTime().setNome("Los Angeles");

        assertEquals("Jogador{nome=Messi, idade='36', posição=atacante, time='Time{nome='Inter Miami', campeonato='MLS}'}", jogador.toString());
        assertEquals("Jogador{nome=Lucas, idade='30', posição=atacante, time='Time{nome='Los Angeles', campeonato='MLS}'}", jogadorClone.toString());
    }
}