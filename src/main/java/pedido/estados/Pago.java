package pedido.estados;

import pedido.EstadoPedido;
import pedido.Pedido;

public class Pago implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("O pedido já foi pago.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado ao cliente.");
        pedido.setEstado(new Enviado());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("O pedido precisa ser enviado antes de ser entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado e pagamento estornado.");
        pedido.setEstado(new Cancelado());
    }
}
