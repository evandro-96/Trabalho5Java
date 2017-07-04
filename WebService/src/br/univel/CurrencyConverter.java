package br.univel;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CurrencyConverter {
	private final double TAXA_CAMBIO_BRL_PARA_USD = 3.18f;
	
	@WebMethod
	public double brlToUsd(double value) {
		return value * TAXA_CAMBIO_BRL_PARA_USD;
	}
}
