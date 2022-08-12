/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */
import java.sql.*;

public class EnviarBase64MySQL {

    public void cadastrar(QuestoesJogo q) throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "INSERT INTO Pergunta(numeroQuestao,alternativaCorreta,alternativa1,alternativa2,alternativa3,alternativa4,questao) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, q.getNumeroQuestao());
        ps.setString(2, q.getItem1Questao());
        ps.setString(3, q.getItem1Questao());
        ps.setString(4, q.getItem2Questao());
        ps.setString(5, q.getItem3Questao());
        ps.setString(6, q.getItem4Questao());
        ps.setString(7, q.getPerguntaQuestao());

        ps.execute();
        ps.close();
        conexao.close();
    }

    public void cadastrarMaterial(MaterialApoio m) throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "INSERT INTO MaterialDeApoio( escopo, material,idMaterial) values(?,?,?)";

        PreparedStatement ps = conexao.prepareStatement(sql);

        
        ps.setString(1, m.getEscopo());
        ps.setString(2, m.getMaterialApoio());
        ps.setInt(3,m.getIdMaterial());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
}
