package message;

import com.Cliente;

public class MessageEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Notificando"+cliente.getNome()+ 
				"através do e-mail "+cliente.getEmail()+": "+mensagem+"\n");
	}
}
