/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */

import java.io.*;
import java.util.*; 
import org.apache.commons.io.FileUtils;
import java.sql.*;




public class ConversaoBase64MaterialDeApoio {
    private static String materialApoioInputCaminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\MaterialDeApoioInput.png";
    private static String materialApoioIfElifElseCaminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\MaterialDeApoioIfElifElse.png";
    private static String materialApoioDefCaminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\MaterialDeApoioDef.png";
    private static String materialApoioWhileCaminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\MaterialDeApoioWhile.png";
    private static String materialApoioForCaminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\MaterialDeApoioFor.png";
    private static String materialApoioListCaminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Fotos\\MaterialDeApoioList.png";
    public static void main(String[] args) {
        try{
            
            EnviarBase64MySQL envio = new EnviarBase64MySQL();


            byte[] materialApoioInput = FileUtils.readFileToByteArray(new File(materialApoioInputCaminho));
            String materialApoioInputString = Base64.getEncoder().encodeToString(materialApoioInput);
            
            MaterialApoio materialInput = new MaterialApoio(materialApoioInputString,"Input",1);
            envio.cadastrarMaterial(materialInput);
        

            byte[] materialApoioIfElifElse = FileUtils.readFileToByteArray(new File(materialApoioIfElifElseCaminho));
            String materialApoioIfElifElseString = Base64.getEncoder().encodeToString(materialApoioIfElifElse);
        
            MaterialApoio materialIfElifElse = new MaterialApoio(materialApoioIfElifElseString,"IfElifElse",2);
            envio.cadastrarMaterial(materialIfElifElse);
        

            byte[] materialApoioDef = FileUtils.readFileToByteArray(new File(materialApoioDefCaminho));
            String materialApoioDefString = Base64.getEncoder().encodeToString(materialApoioDef);
        
            MaterialApoio materialDef = new MaterialApoio(materialApoioDefString,"Def",3);
            envio.cadastrarMaterial(materialDef);
        

            byte[] materialApoioWhile = FileUtils.readFileToByteArray(new File(materialApoioWhileCaminho));
            String materialApoioWhileString = Base64.getEncoder().encodeToString(materialApoioWhile);
        
            MaterialApoio materialWhile = new MaterialApoio(materialApoioWhileString,"While",4);
            envio.cadastrarMaterial(materialWhile);
        
            byte[] materialApoioFor = FileUtils.readFileToByteArray(new File(materialApoioForCaminho));
            String materialApoioForString = Base64.getEncoder().encodeToString(materialApoioFor);
        
            MaterialApoio materialFor = new MaterialApoio(materialApoioForString,"For",5);
            envio.cadastrarMaterial(materialFor);

            byte[] materialApoioList = FileUtils.readFileToByteArray(new File(materialApoioListCaminho));
            String materialApoioListString = Base64.getEncoder().encodeToString(materialApoioList);

            MaterialApoio materialList = new MaterialApoio(materialApoioListString,"List",6);
            envio.cadastrarMaterial(materialList);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }  
}

