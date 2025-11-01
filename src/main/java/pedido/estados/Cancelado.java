package pedido.estados;

import pedido.EstadoPedido;
import pedido.Pedido;

public class Cancelado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Não é possível pagar um pedido cancelado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido cancelado não pode ser enviado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido cancelado não pode ser entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("O pedido já está cancelado.");
    }
}
