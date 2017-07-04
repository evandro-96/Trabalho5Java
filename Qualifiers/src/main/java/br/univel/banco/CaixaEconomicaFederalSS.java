package br.univel.banco;

import br.univel.comum.ServicoBanco;
import br.univel.qualifiers.CaixaEconomicaFederal;

@CaixaEconomicaFederal
public class CaixaEconomicaFederalSS implements ServicoBanco {
	@Override
	public String getSaque() {
		return "Você efetuou um saque na Caixa Econômica Federal";
	}
}
