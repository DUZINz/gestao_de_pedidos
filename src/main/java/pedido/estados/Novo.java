package pedido.estados;

import pedido.EstadoPedido;
import pedido.Pedido;

public class Novo implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento realizado com sucesso.");
        pedido.setEstado(new Pago());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Não é possível enviar um pedido que ainda não foi pago.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido ainda não foi enviado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado com sucesso.");
        pedido.setEstado(new Cancelado());
    }
}
