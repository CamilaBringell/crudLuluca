/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lelucas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Camila Bringel
 */
public class ProdutoDAO {
    private Connection conexao = Conecty.conector();
   
    public void inserir (String descricao, double preco){
        try {
         String sql = "INSERT INTO produto (descricao, preco) VALUES (?, ?)";
           
          try (PreparedStatement ps = conexao.prepareStatement(sql)) {
               
                ps.setString(1, descricao);
                ps.setDouble(2, preco);
                
         int linhasAfetadas = ps.executeUpdate();
           if (linhasAfetadas > 0) {
                    JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum produto inserido.");
                }
           
        } catch (SQLException e) {
              e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto no banco de dados.");
        }
        }
        catch (Exception e){
             e.printStackTrace();
        }
     
        }
            
        
    }

