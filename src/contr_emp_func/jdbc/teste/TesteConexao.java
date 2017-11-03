package contr_emp_func.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import contr_emp_func.jdbc.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!!!");
		connection.close();
	}

}
