/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */
public class QuestoesJogo {
    
    private int numeroQuestao; 
    private String item1Questao;
    private String item2Questao;
    private String item3Questao;
    private String item4Questao;
    private String perguntaQuestao;
    
    
    public QuestoesJogo(int NumeroQuestao, String item1Questao, String item2Questao, String item3Questao, String item4Questao, String perguntaQuestao){
        this.numeroQuestao = NumeroQuestao;
        this.item1Questao = item1Questao;
        this.item2Questao = item2Questao;
        this.item3Questao = item3Questao;
        this.item4Questao = item4Questao;
        this.perguntaQuestao = perguntaQuestao;
    }

    public int getNumeroQuestao() {
        return numeroQuestao;
    }

    public void setNumeroQuestao(int numeroQuestao) {
        this.numeroQuestao = numeroQuestao;
    }

    public String getItem1Questao() {
        return item1Questao;
    }

    public void setItem1Questao(String item1Questao) {
        this.item1Questao = item1Questao;
    }

    public String getItem2Questao() {
        return item2Questao;
    }

    public void setItem2Questao(String item2Questao) {
        this.item2Questao = item2Questao;
    }

    public String getItem3Questao() {
        return item3Questao;
    }

    public void setItem3Questao(String item3Questao) {
        this.item3Questao = item3Questao;
    }

    public String getItem4Questao() {
        return item4Questao;
    }

    public void setItem4Questao(String item4Questao) {
        this.item4Questao = item4Questao;
    }

    public String getPerguntaQuestao() {
        return perguntaQuestao;
    }

    public void setPerguntaQuestao(String perguntaQuestao) {
        this.perguntaQuestao = perguntaQuestao;
    }
    
    

    
    
    
    
    
}
