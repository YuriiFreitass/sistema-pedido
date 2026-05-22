package enums;
public enum StatusPedido {

        ABERTO("Pedido aberto"),
        FECHADO("Pedido fechado"),
        CANCELADO("Pedido cancelado");

        private final String descricaoStatus;

        StatusPedido(String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
        }

    public String getDescricaoStatus() {
        return descricaoStatus;
    }
}

