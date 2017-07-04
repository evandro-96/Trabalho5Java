package br.univel.banco;

import br.univel.comum.ServicoBanco;
import br.univel.qualifiers.HSBC;

@HSBC
public class HSBCS implements ServicoBanco {
	@Override
	public String getSaque() {
		return "Voce efetuou um saque no HSBC";
	}
}
