package br.univel.banco;

import br.univel.comum.ServicoBanco;
import br.univel.qualifiers.BancoDoBrasil;

@BancoDoBrasil
public class BancoDoBrasilS implements ServicoBanco {
	@Override
	public String getSaque() {
		return "Voc� efetuaou um saque no Banco do Brasil";
	}
}
