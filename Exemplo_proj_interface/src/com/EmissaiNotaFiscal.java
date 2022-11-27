package com;

import message.MessageEmail;

public class EmissaiNotaFiscal {

	public void emitir(Cliente cliente, Produto produto) {

		MessageEmail notificar = new MessageEmail();
		notificar.notificar(cliente, "Nota fical do produto " 
				+ produto.getNome() + " foi emitida!");
	}

}
