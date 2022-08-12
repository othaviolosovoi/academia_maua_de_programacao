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

public class MaterialDeApoioDAO {

    public String material(int idMaterial) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT material FROM MaterialDeApoio WHERE idMaterial = ?;";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, idMaterial);

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
    public void cadastrar_material_jogador(String nomeUsuario, int idMaterial) throws Exception{
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "INSERT INTO Jogador_has_MaterialDeApoio(Jogador_nomeUsuario, MaterialDeApoio_idMaterial) VALUES(?,?);";
        
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, nomeUsuario);
        ps.setInt(2, idMaterial);
        
        ps.execute();
        
        ps.close();
        conexao.close();
    }
    public boolean consultar_material_jogador(String nomeUsuario, int idMaterial) throws Exception{
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM Jogador_has_MaterialDeApoio WHERE Jogador_nomeUsuario = ? AND MaterialDeApoio_idMaterial = ?;";
        
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, nomeUsuario);
        ps.setInt(2, idMaterial);
        
        ResultSet rs = ps.executeQuery();
        boolean usuarioExiste = rs.next();
        
        
        rs.close();
        ps.close();
        conexao.close();
        return usuarioExiste;
    }
    
}
