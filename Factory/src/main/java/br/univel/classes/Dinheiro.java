package br.univel.classes;

import br.univel.interfaces.Pagamento;

public class Dinheiro implements Pagamento {
	@Override
	public String getTipoPagamento() {
		return "Dinheiro";
	}
}
