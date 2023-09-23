package org.example;

public class Time implements Cloneable {
    private String nome;
    private String campeonato;

    public Time(String nome, String campeonato) {
        super();
        this.nome = nome;
        this.campeonato = campeonato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", campeonato='" + campeonato +
                '}';
    }
}