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
        List<Usuario> listaUsuario = new ArrayList<Usuario>();
        String sql = "select * from tb_usuario";

        try {
            PreparedStatement selecao = conexao.prepareStatement(sql);
            ResultSet resultado = selecao.executeQuery();

            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setId_usuario(resultado.getInt("id_usuario"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setSobrenome(resultado.getString("sobrenome"));
                listaUsuario.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaUsuario;
    }

    public void alterarUsuario(Usuario usuario) {
        String sql = "update tb_usuario "
                + "set nome=?,sobrenome=? "
                + "where id_usuario=?";
        try {
            PreparedStatement alteracao = conexao.prepareStatement(sql);
            alteracao.setString(1, usuario.getNome());
            alteracao.setString(2, usuario.getSobrenome());
           // alteracao.setInt(3, usuario.getEndereco().getId_endereco());
           // alteracao.setInt(4, usuario.getPerfil().getId_perfil());
            alteracao.setInt(3, usuario.getId_usuario());
            alteracao.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }

    }
    public void deletarUsuario(Usuario usuario){
        String sql = "delete from tb_usuario "
                + "where id_usuario=?";
        try {
            PreparedStatement exclusao = conexao.prepareStatement(sql);
            exclusao.setInt(1, usuario.getId_usuario());
            exclusao.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public List<Endereco> listarLogradouro() {
        List<Endereco> listaLogradouro = new ArrayList<Endereco>();
        String sql = "select logradouro from tb_endereco";

        try {
            PreparedStatement selecaoLogradouro = conexao.prepareStatement(sql);
            ResultSet resultado = selecaoLogradouro.executeQuery();

            while (resultado.next()) {
                Endereco endereco = new Endereco();
                endereco.setLogradouro(resultado.getString("logradouro"));
                listaLogradouro.add(endereco);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaLogradouro;
    }
    
     public List<Endereco> listarComplemento() {
        List<Endereco> listaComplemento = new ArrayList<Endereco>();
        String sql = "select complemento from tb_endereco";

        try {
            PreparedStatement selecaoComplemento = conexao.prepareStatement(sql);
            ResultSet resultado = selecaoComplemento.executeQuery();

            while (resultado.next()) {
                Endereco endereco = new Endereco();
                endereco.setComplemento(resultado.getString("complemento"));
                listaComplemento.add(endereco);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaComplemento;
    }
     
    public List<Endereco> listarBairro() {
        List<Endereco> listaBairro = new ArrayList<Endereco>();
        String sql = "select bairro from tb_endereco";

        try {
            PreparedStatement selecaoBairro = conexao.prepareStatement(sql);
            ResultSet resultado = selecaoBairro.executeQuery();

            while (resultado.next()) {
                Endereco endereco = new Endereco();
                endereco.setBairro(resultado.getString("bairro"));
                listaBairro.add(endereco);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaBairro;
    }
    public List<Endereco> listarNumero() {
        List<Endereco> listaNumero = new ArrayList<Endereco>();
        String sql = "select numero from tb_endereco";

        try {
            PreparedStatement selecaoNumero = conexao.prepareStatement(sql);
            ResultSet resultado = selecaoNumero.executeQuery();

            while (resultado.next()) {
                Endereco endereco = new Endereco();
                endereco.setNumero(resultado.getString("numero"));
                listaNumero.add(endereco);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaNumero;
    }
    
    public List<Endereco> listarCep() {
        List<Endereco> listaCep = new ArrayList<Endereco>();
        String sql = "select cep from tb_endereco";

        try {
            PreparedStatement selecaoCep = conexao.prepareStatement(sql);
            ResultSet resultado = selecaoCep.executeQuery();

            while (resultado.next()) {
                Endereco endereco = new Endereco();
                endereco.setCep(resultado.getString("cep"));
                listaCep.add(endereco);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaCep;
    }
    public List<Perfil> listarNomePerfil() {
        List<Perfil> listaPerfil = new ArrayList<Perfil>();
        String sql = "select nome from tb_perfil";

        try {
            PreparedStatement selecaoPerfil = conexao.prepareStatement(sql);
            ResultSet resultado = selecaoPerfil.executeQuery();

            while (resultado.next()) {
                Perfil perfil = new Perfil();
                perfil.setNome(resultado.getString("nome"));
                listaPerfil.add(perfil);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaPerfil;
    }
}
