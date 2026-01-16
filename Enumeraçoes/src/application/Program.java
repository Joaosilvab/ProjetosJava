package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.PedidoStatus;

public class Program {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1080, new Date(), PedidoStatus.AGUARDANDO_PAGAMENTO);
		
        System.out.println(pedido);
	}

}
