/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */
public class Ranking {
    private int posicao;
    private String nomeUsuario;
    public static int pontuacao;
    public static int tentativas;
    public static String audioCorreto = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Audios\\RespostaCorreta.wav";
    public static String audioErrado = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Audios\\RespostaErrada.wav";
    
    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public Ranking( String nomeUsuario, int pontuacao, int tentativas) {
        this.nomeUsuario = nomeUsuario;
        this.pontuacao = pontuacao;
        this.tentativas = tentativas;
    }
    public Ranking(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    
    
}
