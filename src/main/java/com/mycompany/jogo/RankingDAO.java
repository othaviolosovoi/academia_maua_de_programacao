/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mateu
 */
public class RankingDAO {

    public void criar(Ranking r) throws Exception {
        try {
            //1. abrir conexao com mysql server
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "INSERT INTO Ranking(Jogador_nomeUsuario) VALUES(?)";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setString(1, r.getNomeUsuario());
            //5. executar o comando
            ps.execute();
            //6. fechar os recursos
            ps.close();
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarPontuacao(int Pontuacao, String nomeUsuario) throws Exception {
        Connection conexao = ConnectionFactory.getConnection();

        String sql = "UPDATE Ranking SET pontuacao = ? WHERE Jogador_nomeUsuario = ?;";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ps.setInt(1, Ranking.pontuacao);
        ps.setString(2, Jogador.nomeDoUsuario);

        ps.execute();

        ps.close();
        conexao.close();
    }

    public void atualizarTentativas(int tentativas, String nomeUsuario) throws Exception {
        Connection conexao = ConnectionFactory.getConnection();

        String sql = "UPDATE Ranking SET tentativas = ? WHERE Jogador_nomeUsuario = ?;";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ps.setInt(1, Ranking.tentativas);
        ps.setString(2, Jogador.nomeDoUsuario);

        ps.execute();

        ps.close();
        conexao.close();
    }

    public void pegarPontuacao(String nomeUsuario) throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "select pontuacao, tentativas from Ranking where nomeUsuario = ?";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ps.setString(1, Jogador.nomeDoUsuario);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Ranking.pontuacao = rs.getInt(1);
            Ranking.tentativas = rs.getInt(2);
        }
        rs.close();
        ps.close();
        conexao.close();
    }

    public String consultarRankingTop5Jogador5() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT Jogador_nomeUsuario FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 5";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        String nomeUsuario = "";
        while (rs.next()) {
            nomeUsuario = rs.getString("Jogador_nomeUsuario");

        }
        return nomeUsuario;

    }

    public String consultarRankingTop5Jogador4() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT Jogador_nomeUsuario FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 4";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        String nomeUsuario = "";
        while (rs.next()) {
            nomeUsuario = rs.getString("Jogador_nomeUsuario");

        }
        return nomeUsuario;

    }

    public String consultarRankingTop5Jogador3() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT Jogador_nomeUsuario FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 3";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        String nomeUsuario = "";
        while (rs.next()) {
            nomeUsuario = rs.getString("Jogador_nomeUsuario");

        }
        return nomeUsuario;

    }

    public String consultarRankingTop5Jogador2() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT Jogador_nomeUsuario FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 2";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        String nomeUsuario = "";
        while (rs.next()) {
            nomeUsuario = rs.getString("Jogador_nomeUsuario");

        }
        return nomeUsuario;

    }

    public String consultarRankingTop5Jogador1() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT Jogador_nomeUsuario FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 1";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        String nomeUsuario = "";
        while (rs.next()) {
            nomeUsuario = rs.getString("Jogador_nomeUsuario");

        }
        return nomeUsuario;

    }

    public int consultarRankingTop5Pontuacao5() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT pontuacao FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 5";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int pontuacao = 0;
        while (rs.next()) {
            pontuacao = rs.getInt("pontuacao");

        }
        return pontuacao;

    }

    public int consultarRankingTop5Pontuacao4() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT pontuacao FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 4";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int pontuacao = 0;
        while (rs.next()) {
            pontuacao = rs.getInt("pontuacao");

        }
        return pontuacao;

    }

    public int consultarRankingTop5Pontuacao3() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT pontuacao FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 3";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int pontuacao = 0;
        while (rs.next()) {
            pontuacao = rs.getInt("pontuacao");

        }
        return pontuacao;

    }

    public int consultarRankingTop5Pontuacao2() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT pontuacao FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 2";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int pontuacao = 0;
        while (rs.next()) {
            pontuacao = rs.getInt("pontuacao");

        }
        return pontuacao;

    }

    public int consultarRankingTop5Pontuacao1() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT pontuacao FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 1";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int pontuacao = 0;
        while (rs.next()) {
            pontuacao = rs.getInt("pontuacao");

        }
        return pontuacao;

    }

    public int consultarRankingTop5Tentativas5() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT tentativas FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 5";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int tentativas = 0;
        while (rs.next()) {
            tentativas = rs.getInt("tentativas");

        }
        return tentativas;

    }

    public int consultarRankingTop5Tentativas4() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT tentativas FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 4";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int tentativas = 0;
        while (rs.next()) {
            tentativas = rs.getInt("tentativas");

        }
        return tentativas;

    }

    public int consultarRankingTop5Tentativas3() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT tentativas FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 3";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int tentativas = 0;
        while (rs.next()) {
            tentativas = rs.getInt("tentativas");

        }
        return tentativas;

    }

    public int consultarRankingTop5Tentativas2() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT tentativas FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 2";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int tentativas = 0;
        while (rs.next()) {
            tentativas = rs.getInt("tentativas");

        }
        return tentativas;

    }

    public int consultarRankingTop5Tentativas1() throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "SELECT tentativas FROM Ranking ORDER BY pontuacao  DESC,tentativas ASC LIMIT 1";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int tentativas = 0;
        while (rs.next()) {
            tentativas = rs.getInt("tentativas");

        }
        return tentativas;

    }

}
