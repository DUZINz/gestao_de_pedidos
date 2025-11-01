package pedido.estados;

import pedido.EstadoPedido;
import pedido.Pedido;

public class Enviado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("O pedido já foi pago.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("O pedido já foi enviado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Entrega confirmada. Pedido finalizado!");
        pedido.setEstado(new Entregue());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Não é possível cancelar um pedido já enviado.");
    }
}
