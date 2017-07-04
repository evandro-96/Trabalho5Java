package br.univel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.univel.enums.TipoPagamento;
import br.univel.factory.PagamentoFactory;


@WebServlet("/factory")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Pagamento com:  " + new PagamentoFactory().getPagamento(TipoPagamento.DINHEIRO).getTipoPagamento());
	}
}
