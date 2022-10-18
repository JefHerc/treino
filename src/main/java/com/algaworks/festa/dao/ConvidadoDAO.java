package com.algaworks.festa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.festa.connectionFactory.ConnectionFactory;
import com.algaworks.festa.model.Convidado;

@Repository
public class ConvidadoDAO {

	ConnectionFactory conFac = new ConnectionFactory();
	Connection connection = conFac.getConnection();

	public List<Convidado> listar() {
		List<Convidado> convidados = new ArrayList<>();
		String sql = "SELECT * FROM CONVIDADO";

		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.execute();
			ResultSet rst = pstm.getResultSet();
			while (rst.next()) {
				Convidado convidado = new Convidado(rst.getInt(1), rst.getString(2), rst.getInt(3));
				convidados.add(convidado);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return convidados;
	}

	public void salvar(Convidado convidado) {
		String sql = "INSERT INTO convidado (nome, quantidade_acompanhantes) VALUES (?, ?)";
		
		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.setString(1, convidado.getNome());
			pstm.setInt(2, convidado.getQuantidadeAcompanhantes());
			pstm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
