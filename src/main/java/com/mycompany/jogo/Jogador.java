/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */
public class Jogador {
    private String nome;
    private String email;
    private int idade;
    private String telefone;
    private String nomeUsuario;
    private String senhaUsuario;
    private int pontuacao;
    private int tentativas;
    public static String nomeDoUsuario;
    public static String senhaDoUsuario;

    
    //Tela de Cadastro
    public Jogador(String nome, String email, int idade, String telefone, String nomeUsuario, String senhaUsuario) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
        this.pontuacao = pontuacao;
        this.tentativas = tentativas;
    }
    
    //Tela de Login
    public Jogador(String nomeUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }
    
    //Tela de Config
    public Jogador(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    //Tela de Editar
    public Jogador(String nome, String email, int idade, String telefone, String nomeUsuario, String senhaUsuario, String nomeDoUsuario) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
        this.nomeDoUsuario = nomeDoUsuario;
    }
    
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
}
