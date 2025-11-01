package pedido;

import pedido.estados.Novo;

public class Pedido {
    private EstadoPedido estadoAtual;

    public Pedido() {
        this.estadoAtual = new Novo(); // Estado inicial
    }

    public void setEstado(EstadoPedido novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void pagar() {
        estadoAtual.pagar(this);
    }

    public void enviar() {
        estadoAtual.enviar(this);
    }

    public void entregar() {
        estadoAtual.entregar(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }

    public String getEstado() {
        return estadoAtual.getClass().getSimpleName();
    }
}
