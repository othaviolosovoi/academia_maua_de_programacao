/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

import java.io.*;
import java.util.*; 
import org.apache.commons.io.FileUtils;
import java.sql.*;

/**
 *
 * @author mateu
 */
public class ConversaoBase64 {
    
    //Perguntas do Jogo
    private static String perguntaQuestao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao1Fase1.png";
    private static String perguntaQuestao2Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao2Fase1.png";
    private static String perguntaQuestao3Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao3Fase1.png";
    private static String perguntaQuestao1Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao1Fase2.png";
    private static String perguntaQuestao2Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao2Fase2.png";
    private static String perguntaQuestao3Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao3Fase2.png";
    private static String perguntaQuestao1Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao1Fase3.png";
    private static String perguntaQuestao2Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao2Fase3.png";
    private static String perguntaQuestao3Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao3Fase3.png";
    private static String perguntaQuestao1Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao1Fase4.png";
    private static String perguntaQuestao2Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao2Fase4.png";
    private static String perguntaQuestao3Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao3Fase4.png";
    private static String perguntaQuestao1Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao1Fase5.png";
    private static String perguntaQuestao2Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao2Fase5.png";
    private static String perguntaQuestao3Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao3Fase5.png";
    private static String perguntaQuestao1Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao1Fase6.png";
    private static String perguntaQuestao2Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao2Fase6.png";
    private static String perguntaQuestao3Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\PerguntaQuestao3Fase6.png";
    
  
    //Itens do Jogo
    private static String item1Questao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao1Fase1.png";
    private static String item2Questao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao1Fase1.png";
    private static String item3Questao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao1Fase1.png";
    private static String item4Questao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao1Fase1.png";
    private static String item1Questao2Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao2Fase1.png";
    private static String item2Questao2Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao2Fase1.png";
    private static String item3Questao2Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao2Fase1.png";
    private static String item4Questao2Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao2Fase1.png";
    private static String item1Questao3Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao3Fase1.png";
    private static String item2Questao3Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao3Fase1.png";
    private static String item3Questao3Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao3Fase1.png";
    private static String item4Questao3Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao3Fase1.png";
    private static String item1Questao1Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao1Fase2.png";
    private static String item2Questao1Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao1Fase2.png";
    private static String item3Questao1Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao1Fase2.png";
    private static String item4Questao1Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao1Fase2.png";
    private static String item1Questao2Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao2Fase2.png";
    private static String item2Questao2Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao2Fase2.png";
    private static String item3Questao2Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao2Fase2.png";
    private static String item4Questao2Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao2Fase2.png";
    private static String item1Questao3Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao3Fase2.png";
    private static String item2Questao3Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao3Fase2.png";
    private static String item3Questao3Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao3Fase2.png";
    private static String item4Questao3Fase2Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao3Fase2.png";
    private static String item1Questao1Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao1Fase3.png";
    private static String item2Questao1Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao1Fase3.png";
    private static String item3Questao1Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao1Fase3.png";
    private static String item4Questao1Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao1Fase3.png";
    private static String item1Questao2Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao2Fase3.png";
    private static String item2Questao2Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao2Fase3.png";
    private static String item3Questao2Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao2Fase3.png";
    private static String item4Questao2Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao2Fase3.png";
    private static String item1Questao3Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao3Fase3.png";
    private static String item2Questao3Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao3Fase3.png";
    private static String item3Questao3Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao3Fase3.png";
    private static String item4Questao3Fase3Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao3Fase3.png";
    private static String item1Questao1Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao1Fase4.png";
    private static String item2Questao1Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao1Fase4.png";
    private static String item3Questao1Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao1Fase4.png";
    private static String item4Questao1Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao1Fase4.png";
    private static String item1Questao2Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao2Fase4.png";
    private static String item2Questao2Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao2Fase4.png";
    private static String item3Questao2Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao2Fase4.png";
    private static String item4Questao2Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao2Fase4.png";
    private static String item1Questao3Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao3Fase4.png";
    private static String item2Questao3Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao3Fase4.png";
    private static String item3Questao3Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao3Fase4.png";
    private static String item4Questao3Fase4Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao3Fase4.png";
    private static String item1Questao1Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao1Fase5.png";
    private static String item2Questao1Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao1Fase5.png";
    private static String item3Questao1Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao1Fase5.png";
    private static String item4Questao1Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao1Fase5.png";
    private static String item1Questao2Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao2Fase5.png";
    private static String item2Questao2Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao2Fase5.png";
    private static String item3Questao2Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao2Fase5.png";
    private static String item4Questao2Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao2Fase5.png";
    private static String item1Questao3Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao3Fase5.png";
    private static String item2Questao3Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao3Fase5.png";
    private static String item3Questao3Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao3Fase5.png";
    private static String item4Questao3Fase5Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao3Fase5.png";
    private static String item1Questao1Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao1Fase6.png";
    private static String item2Questao1Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao1Fase6.png";
    private static String item3Questao1Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao1Fase6.png";
    private static String item4Questao1Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao1Fase6.png";
    private static String item1Questao2Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao2Fase6.png";
    private static String item2Questao2Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao2Fase6.png";
    private static String item3Questao2Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao2Fase6.png";
    private static String item4Questao2Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao2Fase6.png";
    private static String item1Questao3Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item1Questao3Fase6.png";
    private static String item2Questao3Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item2Questao3Fase6.png";
    private static String item3Questao3Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item3Questao3Fase6.png";
    private static String item4Questao3Fase6Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\Item4Questao3Fase6.png";
   
    
    
    
            
    public static void main(String[] args) throws IOException{
        
        try{
          
            EnviarBase64MySQL envio = new EnviarBase64MySQL();
        //Questao 1 Fase 1
           
        byte[] perguntaQuestao1Fase1 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase1Caminho));
        String perguntaQuestao1Fase1String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase1);
        

        byte[] item1Questao1Fase1 = FileUtils.readFileToByteArray(new File(item1Questao1Fase1Caminho));
        String item1Questao1Fase1String = Base64.getEncoder().encodeToString(item1Questao1Fase1);
        
        
        byte[] item2Questao1Fase1 = FileUtils.readFileToByteArray(new File(item2Questao1Fase1Caminho));
        String item2Questao1Fase1String = Base64.getEncoder().encodeToString(item2Questao1Fase1);
        
        
        byte[] item3Questao1Fase1 = FileUtils.readFileToByteArray(new File(item3Questao1Fase1Caminho));
        String item3Questao1Fase1String = Base64.getEncoder().encodeToString(item3Questao1Fase1);
        
       
        byte[] item4Questao1Fase1 = FileUtils.readFileToByteArray(new File(item4Questao1Fase1Caminho));
        String item4Questao1Fase1String = Base64.getEncoder().encodeToString(item4Questao1Fase1);
        
        QuestoesJogo questao1 = new QuestoesJogo(1,item3Questao1Fase1String,item2Questao1Fase1String,item1Questao1Fase1String,item4Questao1Fase1String,perguntaQuestao1Fase1String);
        envio.cadastrar(questao1);
        

        //Questao 2 Fase 1
        
        byte[] perguntaQuestao2Fase1 = FileUtils.readFileToByteArray(new File(perguntaQuestao2Fase1Caminho));
        String perguntaQuestao2Fase1String = Base64.getEncoder().encodeToString(perguntaQuestao2Fase1);
        byte[] perguntaQuestao2Fase1Foto = Base64.getDecoder().decode(perguntaQuestao2Fase1String);
        
        byte[] item1Questao2Fase1 = FileUtils.readFileToByteArray(new File(item1Questao2Fase1Caminho));
        String item1Questao2Fase1String = Base64.getEncoder().encodeToString(item1Questao2Fase1);
        byte[] item1Questao2Fase1Foto = Base64.getDecoder().decode(item1Questao2Fase1String);
        
        byte[] item2Questao2Fase1 = FileUtils.readFileToByteArray(new File(item2Questao2Fase1Caminho));
        String item2Questao2Fase1String = Base64.getEncoder().encodeToString(item2Questao2Fase1);
        byte[] item2Questao2Fase1Foto = Base64.getDecoder().decode(item2Questao2Fase1String);
        
        byte[] item3Questao2Fase1 = FileUtils.readFileToByteArray(new File(item3Questao2Fase1Caminho));
        String item3Questao2Fase1String = Base64.getEncoder().encodeToString(item3Questao2Fase1);
        byte[] item3Questao2Fase1Foto = Base64.getDecoder().decode(item3Questao2Fase1String);
        
        byte[] item4Questao2Fase1 = FileUtils.readFileToByteArray(new File(item4Questao2Fase1Caminho));
        String item4Questao2Fase1String = Base64.getEncoder().encodeToString(item4Questao2Fase1);
        byte[] item4Questao2Fase1Foto = Base64.getDecoder().decode(item4Questao2Fase1String);
        
        
        QuestoesJogo questao2 = new QuestoesJogo(2,item1Questao2Fase1String,item2Questao2Fase1String,item3Questao2Fase1String,item4Questao2Fase1String,perguntaQuestao2Fase1String);
        envio.cadastrar(questao2);
        //Questao 3 Fase 1
        
        byte[] perguntaQuestao3Fase1 = FileUtils.readFileToByteArray(new File(perguntaQuestao3Fase1Caminho));
        String perguntaQuestao3Fase1String = Base64.getEncoder().encodeToString(perguntaQuestao3Fase1);
        byte[] perguntaQuestao3Fase1Foto = Base64.getDecoder().decode(perguntaQuestao3Fase1String);
        
        byte[] item1Questao3Fase1 = FileUtils.readFileToByteArray(new File(item1Questao3Fase1Caminho));
        String item1Questao3Fase1String = Base64.getEncoder().encodeToString(item1Questao3Fase1);
        byte[] item1Questao3Fase1Foto = Base64.getDecoder().decode(item1Questao3Fase1String);
        
        byte[] item2Questao3Fase1 = FileUtils.readFileToByteArray(new File(item2Questao3Fase1Caminho));
        String item2Questao3Fase1String = Base64.getEncoder().encodeToString(item2Questao3Fase1);
        byte[] item2Questao3Fase1Foto = Base64.getDecoder().decode(item2Questao3Fase1String);
        
        byte[] item3Questao3Fase1 = FileUtils.readFileToByteArray(new File(item3Questao3Fase1Caminho));
        String item3Questao3Fase1String = Base64.getEncoder().encodeToString(item3Questao3Fase1);
        byte[] item3Questao3Fase1Foto = Base64.getDecoder().decode(item3Questao3Fase1String);
        
        byte[] item4Questao3Fase1 = FileUtils.readFileToByteArray(new File(item4Questao3Fase1Caminho));
        String item4Questao3Fase1String = Base64.getEncoder().encodeToString(item4Questao3Fase1);
        byte[] item4Questao3Fase1Foto = Base64.getDecoder().decode(item4Questao3Fase1String);
        
        QuestoesJogo questao3 = new QuestoesJogo(3,item2Questao3Fase1String,item1Questao3Fase1String,item3Questao3Fase1String,item4Questao3Fase1String,perguntaQuestao3Fase1String);
        envio.cadastrar(questao3);
        //Questao 1 Fase 2
        
        byte[] perguntaQuestao1Fase2 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase2Caminho));
        String perguntaQuestao1Fase2String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase2);
        byte[] perguntaQuestao1Fase2Foto = Base64.getDecoder().decode(perguntaQuestao1Fase2String);
        
        byte[] item1Questao1Fase2 = FileUtils.readFileToByteArray(new File(item1Questao1Fase2Caminho));
        String item1Questao1Fase2String = Base64.getEncoder().encodeToString(item1Questao1Fase2);
        byte[] item1Questao1Fase2Foto = Base64.getDecoder().decode(item1Questao1Fase2String);
        
        byte[] item2Questao1Fase2 = FileUtils.readFileToByteArray(new File(item2Questao1Fase2Caminho));
        String item2Questao1Fase2String = Base64.getEncoder().encodeToString(item2Questao1Fase2);
        byte[] item2Questao1Fase2Foto = Base64.getDecoder().decode(item2Questao1Fase2String);
        
        byte[] item3Questao1Fase2 = FileUtils.readFileToByteArray(new File(item3Questao1Fase2Caminho));
        String item3Questao1Fase2String = Base64.getEncoder().encodeToString(item3Questao1Fase2);
        byte[] item3Questao1Fase2Foto = Base64.getDecoder().decode(item3Questao1Fase2String);
        
        byte[] item4Questao1Fase2 = FileUtils.readFileToByteArray(new File(item4Questao1Fase2Caminho));
        String item4Questao1Fase2String = Base64.getEncoder().encodeToString(item4Questao1Fase2);
        byte[] item4Questao1Fase2Foto = Base64.getDecoder().decode(item4Questao1Fase2String);
        
        
        QuestoesJogo questao4 = new QuestoesJogo(4,item2Questao1Fase2String,item1Questao1Fase2String,item3Questao1Fase2String,item4Questao1Fase2String,perguntaQuestao1Fase2String);
        envio.cadastrar(questao4);
        //Questao 2 Fase 2
        
        byte[] perguntaQuestao2Fase2 = FileUtils.readFileToByteArray(new File(perguntaQuestao2Fase2Caminho));
        String perguntaQuestao2Fase2String = Base64.getEncoder().encodeToString(perguntaQuestao2Fase2);
        byte[] perguntaQuestao2Fase2Foto = Base64.getDecoder().decode(perguntaQuestao2Fase2String);
       
        byte[] item1Questao2Fase2 = FileUtils.readFileToByteArray(new File(item1Questao2Fase2Caminho));
        String item1Questao2Fase2String = Base64.getEncoder().encodeToString(item1Questao2Fase2);
        byte[] item1Questao2Fase2Foto = Base64.getDecoder().decode(item1Questao2Fase2String);
        
        byte[] item2Questao2Fase2 = FileUtils.readFileToByteArray(new File(item2Questao2Fase2Caminho));
        String item2Questao2Fase2String = Base64.getEncoder().encodeToString(item2Questao2Fase2);
        byte[] item2Questao2Fase2Foto = Base64.getDecoder().decode(item2Questao2Fase2String);
        
        byte[] item3Questao2Fase2 = FileUtils.readFileToByteArray(new File(item3Questao2Fase2Caminho));
        String item3Questao2Fase2String = Base64.getEncoder().encodeToString(item3Questao2Fase2);
        byte[] item3Questao2Fase2Foto = Base64.getDecoder().decode(item3Questao2Fase2String);
        
        byte[] item4Questao2Fase2 = FileUtils.readFileToByteArray(new File(item4Questao2Fase2Caminho));
        String item4Questao2Fase2String = Base64.getEncoder().encodeToString(item4Questao2Fase2);
        byte[] item4Questao2Fase2Foto = Base64.getDecoder().decode(item4Questao2Fase2String);
        
        
        QuestoesJogo questao5 = new QuestoesJogo(5,item4Questao2Fase2String,item2Questao2Fase2String,item3Questao2Fase2String,item1Questao2Fase2String,perguntaQuestao2Fase2String);
        envio.cadastrar(questao5);
        //Questao 3 Fase 2
        
        byte[] perguntaQuestao3Fase2 = FileUtils.readFileToByteArray(new File(perguntaQuestao3Fase2Caminho));
        String perguntaQuestao3Fase2String = Base64.getEncoder().encodeToString(perguntaQuestao3Fase2);
        byte[] perguntaQuestao3Fase2Foto = Base64.getDecoder().decode(perguntaQuestao3Fase2String);
        
        byte[] item1Questao3Fase2 = FileUtils.readFileToByteArray(new File(item1Questao3Fase2Caminho));
        String item1Questao3Fase2String = Base64.getEncoder().encodeToString(item1Questao3Fase2);
        byte[] item1Questao3Fase2Foto = Base64.getDecoder().decode(item1Questao3Fase2String);
       
        byte[] item2Questao3Fase2 = FileUtils.readFileToByteArray(new File(item2Questao3Fase2Caminho));
        String item2Questao3Fase2String = Base64.getEncoder().encodeToString(item2Questao3Fase2);
        byte[] item2Questao3Fase2Foto = Base64.getDecoder().decode(item2Questao3Fase2String);
        
        byte[] item3Questao3Fase2 = FileUtils.readFileToByteArray(new File(item3Questao3Fase2Caminho));
        String item3Questao3Fase2String = Base64.getEncoder().encodeToString(item3Questao3Fase2);
        byte[] item3Questao3Fase2Foto = Base64.getDecoder().decode(item3Questao3Fase2String);
        
        byte[] item4Questao3Fase2 = FileUtils.readFileToByteArray(new File(item4Questao3Fase2Caminho));
        String item4Questao3Fase2String = Base64.getEncoder().encodeToString(item4Questao3Fase2);
        byte[] item4Questao3Fase2Foto = Base64.getDecoder().decode(item4Questao3Fase2String);
        
        
        QuestoesJogo questao6 = new QuestoesJogo(6,item3Questao3Fase2String,item2Questao3Fase2String,item1Questao3Fase2String,item4Questao3Fase2String,perguntaQuestao3Fase2String);
        envio.cadastrar(questao6);
        //Questao 1 Fase 3
        
        byte[] perguntaQuestao1Fase3 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase3Caminho));
        String perguntaQuestao1Fase3String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase3);
        byte[] perguntaQuestao1Fase3Foto = Base64.getDecoder().decode(perguntaQuestao1Fase3String);
        
        byte[] item1Questao1Fase3 = FileUtils.readFileToByteArray(new File(item1Questao1Fase3Caminho));
        String item1Questao1Fase3String = Base64.getEncoder().encodeToString(item1Questao1Fase3);
        byte[] item1Questao1Fase3Foto = Base64.getDecoder().decode(item1Questao1Fase3String);
     
        byte[] item2Questao1Fase3 = FileUtils.readFileToByteArray(new File(item2Questao1Fase3Caminho));
        String item2Questao1Fase3String = Base64.getEncoder().encodeToString(item2Questao1Fase3);
        byte[] item2Questao1Fase3Foto = Base64.getDecoder().decode(item2Questao1Fase3String);
        
        byte[] item3Questao1Fase3 = FileUtils.readFileToByteArray(new File(item3Questao1Fase3Caminho));
        String item3Questao1Fase3String = Base64.getEncoder().encodeToString(item3Questao1Fase3);
        byte[] item3Questao1Fase3Foto = Base64.getDecoder().decode(item3Questao1Fase3String);
        
        byte[] item4Questao1Fase3 = FileUtils.readFileToByteArray(new File(item4Questao1Fase3Caminho));
        String item4Questao1Fase3String = Base64.getEncoder().encodeToString(item4Questao1Fase3);
        byte[] item4Questao1Fase3Foto = Base64.getDecoder().decode(item4Questao1Fase3String);
       
        
        QuestoesJogo questao7 = new QuestoesJogo(7,item2Questao1Fase3String,item1Questao1Fase3String,item3Questao1Fase3String,item4Questao1Fase3String,perguntaQuestao1Fase3String);
        envio.cadastrar(questao7);
        
        //Questao 2 Fase 3
        
        byte[] perguntaQuestao2Fase3 = FileUtils.readFileToByteArray(new File(perguntaQuestao2Fase3Caminho));
        String perguntaQuestao2Fase3String = Base64.getEncoder().encodeToString(perguntaQuestao2Fase3);
        byte[] perguntaQuestao2Fase3Foto = Base64.getDecoder().decode(perguntaQuestao2Fase3String);
        
        byte[] item1Questao2Fase3 = FileUtils.readFileToByteArray(new File(item1Questao2Fase3Caminho));
        String item1Questao2Fase3String = Base64.getEncoder().encodeToString(item1Questao2Fase3);
        byte[] item1Questao2Fase3Foto = Base64.getDecoder().decode(item1Questao2Fase3String);
     
        byte[] item2Questao2Fase3 = FileUtils.readFileToByteArray(new File(item2Questao2Fase3Caminho));
        String item2Questao2Fase3String = Base64.getEncoder().encodeToString(item2Questao2Fase3);
        byte[] item2Questao2Fase3Foto = Base64.getDecoder().decode(item2Questao2Fase3String);
        
        byte[] item3Questao2Fase3 = FileUtils.readFileToByteArray(new File(item3Questao2Fase3Caminho));
        String item3Questao2Fase3String = Base64.getEncoder().encodeToString(item3Questao2Fase3);
        byte[] item3Questao2Fase3Foto = Base64.getDecoder().decode(item3Questao2Fase3String);
        
        byte[] item4Questao2Fase3 = FileUtils.readFileToByteArray(new File(item4Questao2Fase3Caminho));
        String item4Questao2Fase3String = Base64.getEncoder().encodeToString(item4Questao2Fase3);
        byte[] item4Questao2Fase3Foto = Base64.getDecoder().decode(item4Questao2Fase3String);
        
        
        QuestoesJogo questao8 = new QuestoesJogo(8,item1Questao2Fase3String,item2Questao2Fase3String,item3Questao2Fase3String,item4Questao2Fase3String,perguntaQuestao2Fase3String);
        envio.cadastrar(questao8);
        
        //Questao 3 Fase 3
        
        byte[] perguntaQuestao3Fase3 = FileUtils.readFileToByteArray(new File(perguntaQuestao3Fase3Caminho));
        String perguntaQuestao3Fase3String = Base64.getEncoder().encodeToString(perguntaQuestao3Fase3);
        byte[] perguntaQuestao3Fase3Foto = Base64.getDecoder().decode(perguntaQuestao3Fase3String);
       
        byte[] item1Questao3Fase3 = FileUtils.readFileToByteArray(new File(item1Questao3Fase3Caminho));
        String item1Questao3Fase3String = Base64.getEncoder().encodeToString(item1Questao3Fase3);
        byte[] item1Questao3Fase3Foto = Base64.getDecoder().decode(item1Questao3Fase3String);
     
        byte[] item2Questao3Fase3 = FileUtils.readFileToByteArray(new File(item2Questao3Fase3Caminho));
        String item2Questao3Fase3String = Base64.getEncoder().encodeToString(item2Questao3Fase3);
        byte[] item2Questao3Fase3Foto = Base64.getDecoder().decode(item2Questao3Fase3String);
        
        byte[] item3Questao3Fase3 = FileUtils.readFileToByteArray(new File(item3Questao3Fase3Caminho));
        String item3Questao3Fase3String = Base64.getEncoder().encodeToString(item3Questao3Fase3);
        byte[] item3Questao3Fase3Foto = Base64.getDecoder().decode(item3Questao3Fase3String);
        
        byte[] item4Questao3Fase3 = FileUtils.readFileToByteArray(new File(item4Questao3Fase3Caminho));
        String item4Questao3Fase3String = Base64.getEncoder().encodeToString(item4Questao3Fase3);
        byte[] item4Questao3Fase3Foto = Base64.getDecoder().decode(item4Questao3Fase3String);
        
        
        QuestoesJogo questao9 = new QuestoesJogo(9,item1Questao3Fase3String,item2Questao3Fase3String,item3Questao3Fase3String,item4Questao3Fase3String,perguntaQuestao3Fase3String);
        envio.cadastrar(questao9);
        
        // Questao 1 Fase 4
        
        byte[] perguntaQuestao1Fase4 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase4Caminho));
        String perguntaQuestao1Fase4String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase4);
        byte[] perguntaQuestao1Fase4Foto = Base64.getDecoder().decode(perguntaQuestao1Fase4String);
       
        byte[] item1Questao1Fase4 = FileUtils.readFileToByteArray(new File(item1Questao1Fase4Caminho));
        String item1Questao1Fase4String = Base64.getEncoder().encodeToString(item1Questao1Fase4);
        byte[] item1Questao1Fase4Foto = Base64.getDecoder().decode(item1Questao1Fase4String);
     
        byte[] item2Questao1Fase4 = FileUtils.readFileToByteArray(new File(item2Questao1Fase4Caminho));
        String item2Questao1Fase4String = Base64.getEncoder().encodeToString(item2Questao1Fase4);
        byte[] item2Questao1Fase4Foto = Base64.getDecoder().decode(item2Questao1Fase4String);
        
        byte[] item3Questao1Fase4 = FileUtils.readFileToByteArray(new File(item3Questao1Fase4Caminho));
        String item3Questao1Fase4String = Base64.getEncoder().encodeToString(item3Questao1Fase4);
        byte[] item3Questao1Fase4Foto = Base64.getDecoder().decode(item3Questao1Fase4String);
        
        byte[] item4Questao1Fase4 = FileUtils.readFileToByteArray(new File(item4Questao1Fase4Caminho));
        String item4Questao1Fase4String = Base64.getEncoder().encodeToString(item4Questao1Fase4);
        byte[] item4Questao1Fase4Foto = Base64.getDecoder().decode(item4Questao1Fase4String);
        
        QuestoesJogo questao10 = new QuestoesJogo(10,item4Questao1Fase4String,item2Questao1Fase4String,item3Questao1Fase4String,item1Questao1Fase4String,perguntaQuestao1Fase4String);
        envio.cadastrar(questao10);
        
        // Questao 2 Fase 4
        
        byte[] perguntaQuestao2Fase4 = FileUtils.readFileToByteArray(new File(perguntaQuestao2Fase4Caminho));
        String perguntaQuestao2Fase4String = Base64.getEncoder().encodeToString(perguntaQuestao2Fase4);
        byte[] perguntaQuestao2Fase4Foto = Base64.getDecoder().decode(perguntaQuestao2Fase4String);
       
        byte[] item1Questao2Fase4 = FileUtils.readFileToByteArray(new File(item1Questao2Fase4Caminho));
        String item1Questao2Fase4String = Base64.getEncoder().encodeToString(item1Questao2Fase4);
        byte[] item1Questao2Fase4Foto = Base64.getDecoder().decode(item1Questao2Fase4String);
     
        byte[] item2Questao2Fase4 = FileUtils.readFileToByteArray(new File(item2Questao2Fase4Caminho));
        String item2Questao2Fase4String = Base64.getEncoder().encodeToString(item2Questao2Fase4);
        byte[] item2Questao2Fase4Foto = Base64.getDecoder().decode(item2Questao2Fase4String);
        
        byte[] item3Questao2Fase4 = FileUtils.readFileToByteArray(new File(item3Questao2Fase4Caminho));
        String item3Questao2Fase4String = Base64.getEncoder().encodeToString(item3Questao2Fase4);
        byte[] item3Questao2Fase4Foto = Base64.getDecoder().decode(item3Questao2Fase4String);
        
        byte[] item4Questao2Fase4 = FileUtils.readFileToByteArray(new File(item4Questao2Fase4Caminho));
        String item4Questao2Fase4String = Base64.getEncoder().encodeToString(item4Questao2Fase4);
        byte[] item4Questao2Fase4Foto = Base64.getDecoder().decode(item4Questao2Fase4String);
        
        
        QuestoesJogo questao11 = new QuestoesJogo(11,item2Questao2Fase4String,item1Questao2Fase4String,item3Questao2Fase4String,item4Questao2Fase4String,perguntaQuestao2Fase4String);
        envio.cadastrar(questao11);
        
        // Questao 3 Fase 4
        
        byte[] perguntaQuestao3Fase4 = FileUtils.readFileToByteArray(new File(perguntaQuestao3Fase4Caminho));
        String perguntaQuestao3Fase4String = Base64.getEncoder().encodeToString(perguntaQuestao3Fase4);
        byte[] perguntaQuestao3Fase4Foto = Base64.getDecoder().decode(perguntaQuestao3Fase4String);
       
        byte[] item1Questao3Fase4 = FileUtils.readFileToByteArray(new File(item1Questao3Fase4Caminho));
        String item1Questao3Fase4String = Base64.getEncoder().encodeToString(item1Questao3Fase4);
        byte[] item1Questao3Fase4Foto = Base64.getDecoder().decode(item1Questao3Fase4String);
     
        byte[] item2Questao3Fase4 = FileUtils.readFileToByteArray(new File(item2Questao3Fase4Caminho));
        String item2Questao3Fase4String = Base64.getEncoder().encodeToString(item2Questao3Fase4);
        byte[] item2Questao3Fase4Foto = Base64.getDecoder().decode(item2Questao3Fase4String);
        
        byte[] item3Questao3Fase4 = FileUtils.readFileToByteArray(new File(item3Questao3Fase4Caminho));
        String item3Questao3Fase4String = Base64.getEncoder().encodeToString(item3Questao3Fase4);
        byte[] item3Questao3Fase4Foto = Base64.getDecoder().decode(item3Questao3Fase4String);
        
        byte[] item4Questao3Fase4 = FileUtils.readFileToByteArray(new File(item4Questao3Fase4Caminho));
        String item4Questao3Fase4String = Base64.getEncoder().encodeToString(item4Questao3Fase4);
        byte[] item4Questao3Fase4Foto = Base64.getDecoder().decode(item4Questao3Fase4String);
        
        
        QuestoesJogo questao12 = new QuestoesJogo(12,item3Questao3Fase4String,item2Questao3Fase4String,item1Questao3Fase4String,item4Questao3Fase4String,perguntaQuestao3Fase4String);
        envio.cadastrar(questao12);
        
        // Questao 1 Fase 5
        
        byte[] perguntaQuestao1Fase5 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase5Caminho));
        String perguntaQuestao1Fase5String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase5);
        byte[] perguntaQuestao1Fase5Foto = Base64.getDecoder().decode(perguntaQuestao1Fase5String);
       
        byte[] item1Questao1Fase5 = FileUtils.readFileToByteArray(new File(item1Questao1Fase5Caminho));
        String item1Questao1Fase5String = Base64.getEncoder().encodeToString(item1Questao1Fase5);
        byte[] item1Questao1Fase5Foto = Base64.getDecoder().decode(item1Questao1Fase5String);
     
        byte[] item2Questao1Fase5 = FileUtils.readFileToByteArray(new File(item2Questao1Fase5Caminho));
        String item2Questao1Fase5String = Base64.getEncoder().encodeToString(item2Questao1Fase5);
        byte[] item2Questao1Fase5Foto = Base64.getDecoder().decode(item2Questao1Fase5String);
        
        byte[] item3Questao1Fase5 = FileUtils.readFileToByteArray(new File(item3Questao1Fase5Caminho));
        String item3Questao1Fase5String = Base64.getEncoder().encodeToString(item3Questao1Fase5);
        byte[] item3Questao1Fase5Foto = Base64.getDecoder().decode(item3Questao1Fase5String);
        
        byte[] item4Questao1Fase5 = FileUtils.readFileToByteArray(new File(item4Questao1Fase5Caminho));
        String item4Questao1Fase5String = Base64.getEncoder().encodeToString(item4Questao1Fase5);
        byte[] item4Questao1Fase5Foto = Base64.getDecoder().decode(item4Questao1Fase5String);

        
        QuestoesJogo questao13 = new QuestoesJogo(13,item4Questao1Fase5String,item2Questao1Fase5String,item3Questao1Fase5String,item1Questao1Fase5String,perguntaQuestao1Fase5String);
        envio.cadastrar(questao13);
        
        // Questao 2 Fase 5
        
        byte[] perguntaQuestao2Fase5 = FileUtils.readFileToByteArray(new File(perguntaQuestao2Fase5Caminho));
        String perguntaQuestao2Fase5String = Base64.getEncoder().encodeToString(perguntaQuestao2Fase5);
        byte[] perguntaQuestao2Fase5Foto = Base64.getDecoder().decode(perguntaQuestao2Fase5String);
       
        byte[] item1Questao2Fase5 = FileUtils.readFileToByteArray(new File(item1Questao2Fase5Caminho));
        String item1Questao2Fase5String = Base64.getEncoder().encodeToString(item1Questao2Fase5);
        byte[] item1Questao2Fase5Foto = Base64.getDecoder().decode(item1Questao2Fase5String);
     
        byte[] item2Questao2Fase5 = FileUtils.readFileToByteArray(new File(item2Questao2Fase5Caminho));
        String item2Questao2Fase5String = Base64.getEncoder().encodeToString(item2Questao2Fase5);
        byte[] item2Questao2Fase5Foto = Base64.getDecoder().decode(item2Questao2Fase5String);
        
        byte[] item3Questao2Fase5 = FileUtils.readFileToByteArray(new File(item3Questao2Fase5Caminho));
        String item3Questao2Fase5String = Base64.getEncoder().encodeToString(item3Questao2Fase5);
        byte[] item3Questao2Fase5Foto = Base64.getDecoder().decode(item3Questao2Fase5String);
        
        byte[] item4Questao2Fase5 = FileUtils.readFileToByteArray(new File(item4Questao2Fase5Caminho));
        String item4Questao2Fase5String = Base64.getEncoder().encodeToString(item4Questao2Fase5);
        byte[] item4Questao2Fase5Foto = Base64.getDecoder().decode(item4Questao2Fase5String);
        
        
        QuestoesJogo questao14 = new QuestoesJogo(14,item1Questao2Fase5String,item2Questao2Fase5String,item3Questao2Fase5String,item4Questao2Fase5String,perguntaQuestao2Fase5String);
        envio.cadastrar(questao14);
        
        // Questao 3 Fase 5
        
        byte[] perguntaQuestao3Fase5 = FileUtils.readFileToByteArray(new File(perguntaQuestao3Fase5Caminho));
        String perguntaQuestao3Fase5String = Base64.getEncoder().encodeToString(perguntaQuestao3Fase5);
        byte[] perguntaQuestao3Fase5Foto = Base64.getDecoder().decode(perguntaQuestao3Fase5String);
       
        byte[] item1Questao3Fase5 = FileUtils.readFileToByteArray(new File(item1Questao3Fase5Caminho));
        String item1Questao3Fase5String = Base64.getEncoder().encodeToString(item1Questao3Fase5);
        byte[] item1Questao3Fase5Foto = Base64.getDecoder().decode(item1Questao3Fase5String);
     
        byte[] item2Questao3Fase5 = FileUtils.readFileToByteArray(new File(item2Questao3Fase5Caminho));
        String item2Questao3Fase5String = Base64.getEncoder().encodeToString(item2Questao3Fase5);
        byte[] item2Questao3Fase5Foto = Base64.getDecoder().decode(item2Questao3Fase5String);
        
        byte[] item3Questao3Fase5 = FileUtils.readFileToByteArray(new File(item3Questao3Fase5Caminho));
        String item3Questao3Fase5String = Base64.getEncoder().encodeToString(item3Questao3Fase5);
        byte[] item3Questao3Fase5Foto = Base64.getDecoder().decode(item3Questao3Fase5String);
        
        byte[] item4Questao3Fase5 = FileUtils.readFileToByteArray(new File(item4Questao3Fase5Caminho));
        String item4Questao3Fase5String = Base64.getEncoder().encodeToString(item4Questao3Fase5);
        byte[] item4Questao3Fase5Foto = Base64.getDecoder().decode(item4Questao3Fase5String);
        
        
        QuestoesJogo questao15 = new QuestoesJogo(15,item4Questao3Fase5String,item2Questao3Fase5String,item3Questao3Fase5String,item1Questao3Fase5String,perguntaQuestao3Fase5String);
        envio.cadastrar(questao15);
        
        // Questao 1 Fase 6
        
        byte[] perguntaQuestao1Fase6 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase6Caminho));
        String perguntaQuestao1Fase6String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase6);
        byte[] perguntaQuestao1Fase6Foto = Base64.getDecoder().decode(perguntaQuestao1Fase6String);
       
        byte[] item1Questao1Fase6 = FileUtils.readFileToByteArray(new File(item1Questao1Fase6Caminho));
        String item1Questao1Fase6String = Base64.getEncoder().encodeToString(item1Questao1Fase6);
        byte[] item1Questao1Fase6Foto = Base64.getDecoder().decode(item1Questao1Fase6String);
     
        byte[] item2Questao1Fase6 = FileUtils.readFileToByteArray(new File(item2Questao1Fase6Caminho));
        String item2Questao1Fase6String = Base64.getEncoder().encodeToString(item2Questao1Fase6);
        byte[] item2Questao1Fase6Foto = Base64.getDecoder().decode(item2Questao1Fase6String);
        
        byte[] item3Questao1Fase6 = FileUtils.readFileToByteArray(new File(item3Questao1Fase6Caminho));
        String item3Questao1Fase6String = Base64.getEncoder().encodeToString(item3Questao1Fase6);
        byte[] item3Questao1Fase6Foto = Base64.getDecoder().decode(item3Questao1Fase6String);
        
        byte[] item4Questao1Fase6 = FileUtils.readFileToByteArray(new File(item4Questao1Fase6Caminho));
        String item4Questao1Fase6String = Base64.getEncoder().encodeToString(item4Questao1Fase6);
        byte[] item4Questao1Fase6Foto = Base64.getDecoder().decode(item4Questao1Fase6String);

        
        QuestoesJogo questao16 = new QuestoesJogo(16,item2Questao1Fase6String,item1Questao1Fase6String,item3Questao1Fase6String,item4Questao1Fase6String,perguntaQuestao1Fase6String);
        envio.cadastrar(questao16);
        
        // Questao 2 Fase 6
        
        byte[] perguntaQuestao2Fase6 = FileUtils.readFileToByteArray(new File(perguntaQuestao2Fase6Caminho));
        String perguntaQuestao2Fase6String = Base64.getEncoder().encodeToString(perguntaQuestao2Fase6);
        byte[] perguntaQuestao2Fase6Foto = Base64.getDecoder().decode(perguntaQuestao2Fase6String);
       
        byte[] item1Questao2Fase6 = FileUtils.readFileToByteArray(new File(item1Questao2Fase6Caminho));
        String item1Questao2Fase6String = Base64.getEncoder().encodeToString(item1Questao2Fase6);
        byte[] item1Questao2Fase6Foto = Base64.getDecoder().decode(item1Questao2Fase6String);
     
        byte[] item2Questao2Fase6 = FileUtils.readFileToByteArray(new File(item2Questao2Fase6Caminho));
        String item2Questao2Fase6String = Base64.getEncoder().encodeToString(item2Questao2Fase6);
        byte[] item2Questao2Fase6Foto = Base64.getDecoder().decode(item2Questao2Fase6String);
       
        byte[] item3Questao2Fase6 = FileUtils.readFileToByteArray(new File(item3Questao2Fase6Caminho));
        String item3Questao2Fase6String = Base64.getEncoder().encodeToString(item3Questao2Fase6);
        byte[] item3Questao2Fase6Foto = Base64.getDecoder().decode(item3Questao2Fase6String);
        
        byte[] item4Questao2Fase6 = FileUtils.readFileToByteArray(new File(item4Questao2Fase6Caminho));
        String item4Questao2Fase6String = Base64.getEncoder().encodeToString(item4Questao2Fase6);
        byte[] item4Questao2Fase65Foto = Base64.getDecoder().decode(item4Questao2Fase6String);
        
        
        QuestoesJogo questao17 = new QuestoesJogo(17,item3Questao2Fase6String,item2Questao2Fase6String,item1Questao2Fase6String,item4Questao2Fase6String,perguntaQuestao2Fase6String);
        envio.cadastrar(questao17);
        
        // Questao 3 Fase 6
        
        byte[] perguntaQuestao3Fase6 = FileUtils.readFileToByteArray(new File(perguntaQuestao3Fase6Caminho));
        String perguntaQuestao3Fase6String = Base64.getEncoder().encodeToString(perguntaQuestao3Fase6);
        byte[] perguntaQuestao3Fase6Foto = Base64.getDecoder().decode(perguntaQuestao3Fase6String);
       
        byte[] item1Questao3Fase6 = FileUtils.readFileToByteArray(new File(item1Questao3Fase6Caminho));
        String item1Questao3Fase6String = Base64.getEncoder().encodeToString(item1Questao3Fase6);
        byte[] item1Questao3Fase6Foto = Base64.getDecoder().decode(item1Questao3Fase6String);
     
        byte[] item2Questao3Fase6 = FileUtils.readFileToByteArray(new File(item2Questao3Fase6Caminho));
        String item2Questao3Fase6String = Base64.getEncoder().encodeToString(item2Questao3Fase6);
        byte[] item2Questao3Fase6Foto = Base64.getDecoder().decode(item2Questao3Fase6String);
        
        byte[] item3Questao3Fase6 = FileUtils.readFileToByteArray(new File(item3Questao3Fase6Caminho));
        String item3Questao3Fase6String = Base64.getEncoder().encodeToString(item3Questao3Fase6);
        byte[] item3Questao3Fase6Foto = Base64.getDecoder().decode(item3Questao3Fase6String);
        
        byte[] item4Questao3Fase6 = FileUtils.readFileToByteArray(new File(item4Questao3Fase6Caminho));
        String item4Questao3Fase6String = Base64.getEncoder().encodeToString(item4Questao3Fase6);
        byte[] item4Questao3Fase6Foto = Base64.getDecoder().decode(item4Questao3Fase6String);

        
        QuestoesJogo questao18 = new QuestoesJogo(18,item3Questao3Fase6String,item2Questao3Fase6String,item1Questao3Fase6String,item4Questao3Fase6String,perguntaQuestao3Fase6String);
        envio.cadastrar(questao18);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


