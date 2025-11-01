package pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        System.out.println("Estado inicial: " + pedido.getEstado());

        pedido.pagar();
        System.out.println("Estado atual: " + pedido.getEstado());

        pedido.enviar();
        System.out.println("Estado atual: " + pedido.getEstado());

        pedido.entregar();
        System.out.println("Estado atual: " + pedido.getEstado());

        pedido.cancelar(); // tentativa após entrega
    }
}
