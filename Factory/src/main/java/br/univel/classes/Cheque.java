package br.univel.classes;

import br.univel.interfaces.Pagamento;

public class Cheque implements Pagamento {
	@Override
	public String getTipoPagamento() {
		return "Cheque";
	}
}
