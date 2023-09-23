package org.example;

public class Jogador implements Cloneable {
    private String nome;
    private Integer idade;
    private String posicao;
    private Time time;


    public Jogador(String nome, Integer idade, String posicao, Time time) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public Jogador clone() throws CloneNotSupportedException {
        Jogador jogadorClone = (Jogador) super.clone();
        jogadorClone.time = (Time) jogadorClone.time.clone();
        return jogadorClone;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome=" + nome +
                ", idade='" + idade + '\'' +
                ", posição=" + posicao +
                ", time='" + time + '\'' +
                '}';
    }


}