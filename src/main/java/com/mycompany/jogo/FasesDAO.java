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

public class FasesDAO {

    public String questao(Fases f) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT questao FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);

            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String questaoFase = rs.getString(1);
                rs.close();
                ps.close();
                conexao.close();
                return questaoFase;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public String alternativa1(Fases f) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT alternativa1 FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);

            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String alternativa1 = rs.getString(1);
                rs.close();
                ps.close();
                conexao.close();
                return alternativa1;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String alternativa2(Fases f) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT alternativa2 FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);

            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String alternativa2 = rs.getString(1);
                rs.close();
                ps.close();
                conexao.close();
                return alternativa2;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String alternativa3(Fases f) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT alternativa3 FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);

            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String alternativa3 = rs.getString(1);
                rs.close();
                ps.close();
                conexao.close();
                return alternativa3;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String alternativa4(Fases f) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT alternativa4 FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);

            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String alternativa4 = rs.getString(1);
                rs.close();
                ps.close();
                conexao.close();
                return alternativa4;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void enviar_jogador_pergunta(int idFase, String nomeUsuario) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "INSERT INTO Jogador_has_Pergunta(Pergunta_numeroQuestao, Jogador_nomeUsuario) VALUES (?,?)";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, Fases.idFase);
            ps.setString(2, Jogador.nomeDoUsuario);
            //5. executar o comando
            ps.execute();

            //6. fechar os recursos
            ps.close();
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public boolean verificar_jogador_pergunta(int idFase, String nomeUsuario) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT Jogador_nomeUsuario, Pergunta_numeroQuestao FROM Jogador_has_Pergunta WHERE Pergunta_numeroQuestao = ? AND Jogador_nomeUsuario = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, Fases.idFase);
            ps.setString(2, Jogador.nomeDoUsuario);
            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            boolean usuarioExiste = rs.next();

            //6. fechar os recursos
            rs.close();
            ps.close();
            conexao.close();

            return usuarioExiste;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    public void alterar_jogador_pergunta(Jogador j, String nomeUsuario) {
        try{
            Connection conexao = ConnectionFactory.getConnection();
            
            String sql = "UPDATE jogador_has_pergunta SET Jogador_nomeUsuario = ? WHERE Jogador_nomeUsuario = ?";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setString(1, j.getNomeUsuario() );
            ps.setString(2, Jogador.nomeDoUsuario);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
