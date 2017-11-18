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

    public int salvarUsuario(Usuario usuario) {
        String sql = "insert into tb_usuario"
                + "(nome, sobrenome)"
                + "values(?,?)";
        try {
            PreparedStatement preparacaoDaInstrucao = conexao.prepareStatement(sql);
            preparacaoDaInstrucao.setString(1, usuario.getNome());
            preparacaoDaInstrucao.setString(2, usuario.getSobrenome());
            JOptionPane.showMessageDialog(null, "Cadastro relizado com sucesso!");
            return preparacaoDaInstrucao.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
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
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listaParaRetorno;
    }

    public int alterarUsuario(Usuario usuario) {
        String sql = "update tb_usuario"
                + "set nome=?,sobrenome=?";
        try {
            PreparedStatement alteracao = conexao.prepareStatement(sql);
            alteracao.setString(1, usuario.getNome());
            alteracao.setString(2, usuario.getSobrenome());
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            return alteracao.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }

    }
    public void deletarUsuario(Usuario usuario){
        String sql = "delete from tb_usuario"
                + "where id_usuario=?";
        try {
            PreparedStatement exclusao = conexao.prepareStatement(sql);
            exclusao.setString(1, usuario.getNome());
            exclusao.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
