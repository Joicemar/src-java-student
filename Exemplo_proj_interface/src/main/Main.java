package main;

import com.AtivaClienteService;
import com.Cliente;

import message.MessageEmail;
import message.MessageSMS;
import message.Notificador;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao", "joao@sas.com", "989656555");
		Cliente maria = new Cliente("Maria", "maria@sas.com", "989713855");
		
		Notificador notificador = new MessageSMS();
		
		AtivaClienteService ativarCliente = new AtivaClienteService(notificador);
		ativarCliente.ativar(joao);
		ativarCliente.ativar(maria);

	}

}
