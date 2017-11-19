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
public class DAOEndereco {
    Connection conexao = Conexao.criarConexao();
    
    public void inserirEndereco(Endereco endereco){
        String sql = "insert into tb_endereco "
                + "(logradouro, complemento, bairro, numero, cep) "
                + "values(?,?,?,?,?)";
        try {
            PreparedStatement inserir = conexao.prepareStatement(sql);
            inserir.setString(1, endereco.getLogradouro());
            inserir.setString(2, endereco.getComplemento());
            inserir.setString(3, endereco.getBairro());
            inserir.setString(4, endereco.getNumero());
            inserir.setString(5, endereco.getCep());
            inserir.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public List<Endereco> listarEndereco(){
        List<Endereco> listaEndereco = new ArrayList<Endereco>();
        String sql = "select * from tb_endereco";
        try {
            PreparedStatement listar = conexao.prepareStatement(sql);
            ResultSet retorno = listar.executeQuery();
            while(retorno.next()){
                Endereco endereco = new Endereco();
                endereco.setId_endereco(retorno.getInt("id_endereco"));
                endereco.setLogradouro(retorno.getString("logradouro"));
                endereco.setComplemento(retorno.getString("complemento"));
                endereco.setBairro(retorno.getString("bairro"));
                endereco.setNumero(retorno.getString("numero"));
                endereco.setCep(retorno.getString("cep"));
                listaEndereco.add(endereco);     
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return listaEndereco;  
    }
    
    public void alterarEndereco(Endereco endereco){
        String sql = "update tb_endereco "
                + "set logradouro=?, complemento=?, bairro=?, "
                + "numero=?, cep=? where id_endereco=?";
 
        try {
            PreparedStatement altera = conexao.prepareStatement(sql);
            altera.setString(1, endereco.getLogradouro());
            altera.setString(2, endereco.getComplemento());
            altera.setString(3, endereco.getBairro());
            altera.setString(4, endereco.getNumero());
            altera.setString(5, endereco.getCep());
            altera.setInt(6, endereco.getId_endereco());
            altera.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void deletarEndereco(int id_endereco){
        String sql = "delete from tb_endereco "
                + "where id_endereco=?";
        
        try {
            PreparedStatement deleta = conexao.prepareStatement(sql);
            deleta.setInt(1, id_endereco);
            deleta.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso");
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
    }
}
