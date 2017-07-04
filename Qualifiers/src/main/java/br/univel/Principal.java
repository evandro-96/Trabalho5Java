package br.univel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.univel.comum.ServicoBanco;

import br.univel.qualifiers.HSBC;
import br.univel.qualifiers.BancoDoBrasil;
import br.univel.qualifiers.CaixaEconomicaFederal;

@WebServlet("/qualifiers")
public class Principal extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    @Inject
    @BancoDoBrasil
    private ServicoBanco BancoDoBrasilService;
 
    @Inject
    @CaixaEconomicaFederal
    private ServicoBanco CaixaEconomicaService;
 
    @Inject
    @HSBC
    private ServicoBanco HSBCService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		writer.println(BancoDoBrasilService.getSaque());
		writer.println(CaixaEconomicaService.getSaque());
		writer.println(HSBCService.getSaque());
		writer.flush();
	}
}
