/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho.av2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Claudir
 */
public class DAOPerfil {
    Connection conexao = Conexao.criarConexao();
    
    public void inserirPerfil(Perfil perfil){
        String sql = "insert into tb_perfil "
                + "(nome, descricao) "
                + "values(?,?)";
        try {
            PreparedStatement inserir = conexao.prepareStatement(sql);
            inserir.setString(1,perfil.getNome());
            inserir.setString(2, perfil.getDescricao());
            inserir.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public List<Perfil> listarPerfil(){
        List<Perfil> listaPerfil = new ArrayList<Perfil>();
        String sql = "select * from tb_perfil";
        try {
            PreparedStatement listar = conexao.prepareStatement(sql);
            ResultSet retorno = listar.executeQuery();
            while(retorno.next()){
                Perfil perfil = new Perfil();
                perfil.setId_perfil(retorno.getInt("id_perfil"));
                perfil.setNome(retorno.getString("nome"));
                perfil.setDescricao(retorno.getString("descricao"));
                listaPerfil.add(perfil);     
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaPerfil;  
    }
    
    public void alterarPerfil(Perfil perfil){
        String sql = "update tb_perfil "
                + "set nome=?, descricao=? "
                + "where id_perfil=?";
        
        try {
            PreparedStatement altera = conexao.prepareStatement(sql);
            altera.setString(1, perfil.getNome());
            altera.setString(2, perfil.getDescricao());
            altera.setInt(3,perfil.getId_perfil());
            altera.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void deletarPerfil(Perfil perfil){
        String sql = "delete from tb_perfil "
                + "where id_perfil=?";
        
        try {
            PreparedStatement deleta = conexao.prepareStatement(sql);
            deleta.setInt(1, perfil.getId_perfil());
            deleta.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso");
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
    }
}
