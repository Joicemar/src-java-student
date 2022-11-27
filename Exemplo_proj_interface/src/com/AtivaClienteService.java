package com;

import message.MessageEmail;
import message.Notificador;

public class AtivaClienteService {

	private Notificador notificar;
	
	public AtivaClienteService(Notificador notificador) {
		this.notificar = notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		this.notificar.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
