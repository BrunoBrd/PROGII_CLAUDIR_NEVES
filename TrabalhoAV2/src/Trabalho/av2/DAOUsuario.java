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
public class DAOUsuario {

    Connection conexao = Conexao.criarConexao();

    public void salvarUsuario(Usuario usuario) {
        String sql = "insert into tb_usuario"
                + "(nome, sobrenome)"
                + "values(?,?)";
        try {
            PreparedStatement inserir = conexao.prepareStatement(sql);
            inserir.setString(1, usuario.getNome());
            inserir.setString(2, usuario.getSobrenome());
            inserir.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro relizado com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }

    }

    public List<Usuario> listarUsuario() {
        List<Usuario> listaParaRetorno = new ArrayList<Usuario>();
        String sql = "select * from tb_usuario";

        try {
            PreparedStatement instrucaoSelecao = conexao.prepareStatement(sql);
            ResultSet resultado = instrucaoSelecao.executeQuery();

            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setId_usuario(resultado.getInt("id_usuario"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setSobrenome(resultado.getString("sobrenome"));
                listaParaRetorno.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaParaRetorno;
    }

    public void alterarUsuario(Usuario usuario) {
        String sql = "update tb_usuario "
                + "set nome=?,sobrenome=? "
                + "where id_usario=?";
        try {
            PreparedStatement alteracao = conexao.prepareStatement(sql);
            alteracao.setString(1, usuario.getNome());
            alteracao.setString(2, usuario.getSobrenome());
            alteracao.setInt(3, usuario.getId_usuario());
            alteracao.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }

    }
    public void deletarUsuario(int id_usuario){
        String sql = "delete from tb_usuario "
                + "where id_usuario=?";
        try {
            PreparedStatement exclusao = conexao.prepareStatement(sql);
            exclusao.setInt(1, id_usuario);
            exclusao.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
}
