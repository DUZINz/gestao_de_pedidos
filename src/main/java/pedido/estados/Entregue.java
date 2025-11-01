package pedido.estados;

import pedido.EstadoPedido;
import pedido.Pedido;

public class Entregue implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("O pedido já foi finalizado e entregue.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("O pedido já foi entregue.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("O pedido já foi entregue anteriormente.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Não é possível cancelar um pedido já entregue.");
    }
}
