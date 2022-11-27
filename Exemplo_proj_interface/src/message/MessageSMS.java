package message;

import com.Cliente;

public class MessageSMS implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Notificando"+cliente.getNome()+ 
				"através do telefone "+cliente.getTelefone()+": "+mensagem+"\n");
	}

}
