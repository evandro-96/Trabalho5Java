package br.univel.factory;

import javax.ws.rs.Produces;

import br.univel.classes.Cheque;
import br.univel.classes.Dinheiro;
import br.univel.enums.TipoPagamento;
import br.univel.interfaces.Pagamento;

public class PagamentoFactory {
	@Produces
	public Pagamento getPagamento(TipoPagamento tipoPagamento){
		switch (tipoPagamento) {
		case DINHEIRO:
			return new Dinheiro();
		case CHEQUE:
			return new Cheque();
		default:
			return null;
		}
	}
}
